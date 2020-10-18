
import java.util.Scanner;

public class DoubleUserInput {
    double userInput;
    Scanner input = new Scanner(System.in);
    void setUserInput () {
        
            
            while(!input.hasNextDouble()) {
                System.out.println("That is not the requested input");
                input.next();
            }
            userInput = input.nextDouble();
    
    }

   public double getUserInput() {
        return userInput;
        }
}
