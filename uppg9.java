
import java.util.Scanner;

public class uppg9 {
    
        public static void main(final String[] args) {
            // variabler
            int computerNumber = 0;
            int userNumber = 0;
            int shutdown = 3;
            final Scanner input = new Scanner(System.in);
            int guesses = 0;
            int max = 0;
            

            //så länge shutdown inte är 0 körs loopen
            while(shutdown != 0)
            {
                //random nummer mellan [1-10]
                if(shutdown == 3) {
                    System.out.println("Gissa ett tal mellan 1 och M. Välj svårighetsgrad för gissningsspelet genom att ge \n ett värde för M: " );
                    max = input.nextInt();
                    computerNumber = (int) (Math.random() * ((max-1) + 1) + 1);
                    
                   
                    shutdown = 1;
                }
            
               
            
                //Fråga av användaren om en gissning
                System.out.println(" Gissa en siffra mellan 1 och " + max);
                userNumber= input.nextInt();
                guesses++;
                
                //Vinst
                if(computerNumber==userNumber)
                {
                    System.out.println("Du gissade rätt!");
                    System.out.println("Datorn valde " + computerNumber + ", du gissade: " + guesses + " gånger.");
                
                    System.out.println("Vill du köra igen (1 = ja, 0 = nej)? ");

                    userNumber = input.nextInt();
                    System.out.println("Okej! " + userNumber);
                    if (userNumber == 1 ) {
                        shutdown = 3;
                        guesses = 0;
                    } else if (userNumber == 0) {
                        shutdown = 0;
                        System.out.println("Tack för att du spelade! ");
                        input.close();
                        System.exit(0);
                    }
                }
                
                if( (userNumber != computerNumber) && shutdown != 3)
                {
                    System.out.println("Fel!");
                    if(userNumber >= computerNumber) {
                        System.out.println("Lägre");
                    } else if (userNumber <= computerNumber) {
                        System.out.println("Högre!");
                    }
                    
                }
                

            }
        }
    }

