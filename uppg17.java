import java.util.Scanner;


public class uppg17 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    IntInputChecker intChecker = new IntInputChecker(); 
    
        DoubleArrayFiller observationArray = new DoubleArrayFiller();
    
        int userInput;
       System.out.print("Temperature Observer");
       consolePrinter(20);
       System.out.println("Ver. a0.3");
       System.out.println("\n\n\n Welcome to the temperature observer program");
        System.out.println("\n How many Temperature observations do you have?");
    
        intChecker.inputCheck();
        userInput = intChecker.getUserInput();
        observationArray.setArrayLenght(userInput);
        observationArray.fillArray();
        //Göra en while loop för att fixa resten av frågorna. funkar så här långt iaf
        






    }

    static void consolePrinter(int i) {
        for(int e = 0; e < i; e++) {
            System.out.print('-');
        }
    } 
}
