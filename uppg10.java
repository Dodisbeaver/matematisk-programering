
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class uppg10 {

// Gör ett Java-konsolprogram som frågar efter N antal realtal (flyttal). N måste vara ett heltal mellan 5 och 10. Om ett felaktigt värde ges skall programmet be användaren mata in N pånytt. Sedan ber programmet användaren mata in N antal realtal vilka skall sparas i en realtalstabell (array). Till slut visar programmet på bildskärmen:
// - talen i omvänd ordning
// - största talet
// - minsta talet
// - medelvärdet
    public static void main(String[] args) {
        
        
        
        
        int userInput = 0;
        System.out.println("Ge ett heltal för ett antal siffror. Talet måste vara  ett heltal mellan 5 och 10");
        Scanner input = new Scanner(System.in);
        userInput = intInputCheck(5, 10);
        
        
        double popInt[] = new double[userInput];
        
        
        for (int i = 0; i < userInput; i++){
            System.out.println("Värde nr " + (i + 1));
            
            popInt[i] = input.nextDouble();
            
        }
        System.out.println("Talen i omvänd ordning: ");
        for (int i = userInput - 1; i >= 0; i--) {
            System.out.print(popInt[i] + ", ");
        }
        
        double largestNumber = popInt[0];
        double smallestNumber = popInt[0];
        double meanNr = 0;
        for (int i = 0; i < userInput; i++) {
            if (popInt [i] > largestNumber){
                largestNumber = popInt[i];
            }

            if (popInt[i] < smallestNumber) {
                smallestNumber = popInt[i];
            }
            meanNr = (popInt[i] + meanNr);
        }
        System.out.println("\n Största talet: ");
        System.out.print(largestNumber);
        System.out.println("\nMinsta talet: ");
        System.out.print(smallestNumber);

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
