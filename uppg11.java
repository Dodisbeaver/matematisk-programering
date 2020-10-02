import java.util.InputMismatchException;
import java.util.Scanner;

// Gör ett konsolprogram i Java som tillåter användaren att boka spårvagnsbiljetter, givetvis med rätt så många förenklingar!! 

 

// "Hårdkoda" in i programmet att en:

// - normalbiljett (för 18-64 år gamla) kostar 10€

// - barnbiljett (för 4 - 17 år gamla) kostar 5€

// - spädbarnsbiljett (för 0 - 3 år gamla) är gratis

// - pensionärsbiljett (för över 64 år gamla) kostar 8€

 

// Vid programkörning frågar bokningsprogrammet först efter för hur många personer  
// användaren vill boka biljetter. Därefter frågar programmet efter åldern för varje person. 
// En inmatad ålder ska inte få vara lägre än 0 eller strörre än 130, om så sker ska
//  progammet upprepa att fråga efter personens ålder tills en giltig ålder har matats in.
// När alla personers åldrar inmatats ska programmet presentera följande meny för användaren:
// 1. Visa totalt pris
// 2. Visa medelpris per person
// 3. Avsluta programmet
// Om användaren väljer 
//     Alternativ 1 ska programmet räkna ihop totala priset för alla biljetter (med de inmatade personernas åldrar taget i beaktande) och visa det på skärmen. Därefter visas menyn pånytt
//     Alternativ 2 ska programmet räkna ihop medelpriset per person för alla biljetter och visa det på skärmen. Därefter visas menyn pånytt
//     Alternativ 3 ska programmet avslutas
//     Någat annat än 1-3 ska programmet säga "FELAKTIGT MENYVAL" och visa menyn pånytt. 
// En fungerande programkörning kan se ut så här (input av användaren skrivet som bold text):
// ----------------------

// HSL App version 0.001
// Hur många biljetter vill du boka?: 3
// Ange ålder för person 1: 3
// Ange ålder för person 2: -1
// Ange ålder för person 2: 131
// Ange ålder för person 2: 10 
// Ange ålder för person 3: 33
// 1. Visa totalt pris
// 2. Visa medelpris per person
// 3. Avsluta programmet
// : 1
// TOTALT PRIS: 15€
// 1. Visa totalt pris
// 2. Visa medelpris per person
// 3. Avsluta programmet
// : 2
// MEDELPRIS PER PERSON: 5€
// 1. Visa totalt pris
// 2. Visa medelpris per person
// 3. Avsluta programmet
// : 55
// FELAKTIGT MENYVAL! 
// 1. Visa totalt pris
// 2. Visa medelpris per person
// 3. Avsluta programmet
// : 3

// TREVLIG RESA!

public class uppg11 {
    static int maxAge = 130;
    static int minAge = 0;
    static int minBookingAmount = 1;
    static int maxBookingAmount = 2147483647;
    static int normalTicket = 10;
    static int childTicket = 5;
    static int infantTicket = 0;
    static int oldTicket = 8;
    static Scanner input = new Scanner(System.in);
    static int age;
    static int tickets;
    static int [] ticketArray;

    public static void main(final String[] args) {

        System.out.println("Hej, välkommen till biljettbokningen");
        System.out.println("Hur många biljetter vill du boka?:");
        tickets = numberCheck(minAge, maxAge);
        
        System.out.println("Vilken ålder är passagerarna?");
        ageArrayLoop(tickets);

        System.out.println("Totalt pris: " + calculatePrice() + "€");

        System.out.println("Medelpris per person: " + calculatePrice()/tickets);

        System.out.println("Trevlig resa!");
        System.exit(0);
    }

    // metod som kollar input mot min och maxvärde

    static int numberCheck(int min, int max) {
        
        
        int userInput = 0;
        boolean wrongInput = false;
        while (wrongInput == false) {

            try {
                userInput = (int) input.nextInt();
                
            } catch (final InputMismatchException e)
            {
                System.out.println("Du kan inte använda annat än heltal.");
                input.next();
                continue;
            }

            if (userInput < min || userInput > max) {
                System.out.println("Du matade in någonting fel. Vänligen försök på nytt ett heltal mellan " + min
                + " och " + max + " ");
                

            } else if (userInput >= min && userInput <= max) {
                wrongInput = true;
                return userInput;
            
            }
            
         }
         return userInput;
    }


    //metod som fyller arrayen med åldersbiljetter
    static void ageArrayLoop(int numberTickets){
            ticketArray = new int [numberTickets];
            int temp = 0;
            for (int i = 0; i < numberTickets; i++) {
                System.out.println("Vänligen ge åldern för passagerare: " + (i + 1) );
                temp = numberCheck(minAge, maxAge);
                if (temp >= 18 && temp <= 64){
                    System.out.println(10);
                    ticketArray [i] = normalTicket;
                } else if (temp >= 4 &&  temp <= 17) {
                    System.out.println(5);
                    ticketArray[i] = childTicket;
                } else if (temp >= 0 && temp <= 3) {
                    System.out.println(0);
                    ticketArray[i] = infantTicket;
                } else if (temp >= 64) {
                    System.out.println(8);
                    ticketArray[i] = oldTicket;
                }
                
            }
            
    }

    static int calculatePrice() {
        int price = 0;
        for (int i = 0; i < tickets; i++) {
            price = ticketArray[i] + price;
        }
        return price;
    }
}