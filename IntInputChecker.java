import java.util.Scanner;

public class IntInputChecker {
    int userInput;
    Scanner input = new Scanner(System.in);
    void inputCheck () {
    do {
        System.out.println("Please give a positive integer");
        while (!input.hasNextInt()) {
            System.out.println("That is not a what you should input..");
            input.next();
        }
        userInput = input.nextInt();
    }while (userInput <= 0);

   
}
    int getUserInput() {
        return userInput;
    }
}
