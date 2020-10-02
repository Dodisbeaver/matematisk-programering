import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class uppg12 {
    public static void main(String[] args) {
        
        
        
        
        int userInput = 0;
        System.out.println("Temperaturmätare ------------- Version alpha 0.1");
        System.out.println("Hur många temperaturmätningar vill du göra?");
        Scanner input = new Scanner(System.in);
        userInput = intInputCheck(0, Integer.MAX_VALUE);
        
        
        double popInt[] = new double[userInput];
        
        
        for (int i = 0; i < userInput; i++){
            System.out.println("Temperaturvärde nr " + (i + 1));
            
            popInt[i] = input.nextDouble();
            
        }
        double median = 0;

        if ((userInput%2) == 0) {
                       
        }
        
        double middleNr = popInt[0];
        
        double meanNr = 0;
        for (int i = 0; i < userInput; i++) {

            meanNr = (popInt[i] + meanNr);
        }


        meanNr = (meanNr/userInput);
        System.out.println("\nMedel värdet: " + meanNr);

        input.close();
    }
 

    // metod som kollar om int är rätt
    static int intInputCheck ( int min, int max) {
        
        boolean wrongInput = false;
        int userInput = -1;
        Scanner input = new Scanner(System.in); 
                 
        while (wrongInput == false){
            
            try {
                 
                System.out.println("Mata in ett heltal mellan " + min + " och " + max);
                userInput = (int)input.nextInt();
                
                // break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Du kan inte använda annat än siffror.");
                input.next();
                continue;
            }catch (NoSuchElementException e) {
                System.out.println("Hups, något gick fel...");
                input.next();
                System.out.println(" ");

                continue;

            }

            if (userInput < min || userInput > max ) {
                
                System.out.println("Du måste mata in ett heltal mellan " + min + " och " + max);

            } else if (userInput >= min && userInput <= max) {
                
                wrongInput = true;
                
                return userInput;
            }

            

        }
        
        return userInput;
    }
}
