import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
// Assignment

// Skriv ett konsolprogram i Java som vid körning resulterar i följande programutskrift (input av användaren är skriven som bold text):

// --------------------------------------------------

// Adobe console photoshop V0.1


// 1. Draw line
// 2. Draw Rectangle
// 3. Exit
// : 1
// Length: 20
// ********************

 

// 1. Draw line
// 2. Draw Rectangle
// 3. Exit
// : 2
// Width: 20
// Height: 20
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************
// ********************


// 1. Draw line
// 2. Draw Rectangle
// 3. Exit
// : 3

// Process finished with exit code 0

// --------------------------------------------------

 

// Koden som ritar ut linjer på basen av längd och rektanglar på basen av bredd och höjd bör definieras i egna metoder:

//     drawLine
//         Tar in längden som parameter och ritar linjen enligt parametervärdet
//         Anropas från main-metoden efter att användaren matat in önskad längd.
//     drawRect
//         Tar in bredd och höjd som parametrar och ritar rektangeln enligt dessa värden 
//         Anropas från main-metoden efter att användaren matat in önskad bredd och höjd
public class uppg14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int length;
        int height;
        int system = 0;
        
        drawLine(50, '-');
        System.out.println("\n\n\n Dodis print  ver. a 0.0.1 \n\n\n\n");
        while (system != 3) {
            System.out.println("\n 1. Draw Line \n 2. Draw Rectangle \n 3. Exit ");
            system = intInputCheck(1, 3);

            if (system == 1) {
                System.out.println("Please input length of line: \n");
                length = intInputCheck(0, Integer.MAX_VALUE);
                drawLine(length, '*');
            } else if (system == 2) {
                System.out.println(" Please input width of rectangle" );
                length = intInputCheck(0, Integer.MAX_VALUE);
                
                System.out.println("Please input height of rectangle");
                height = intInputCheck(0, Integer.MAX_VALUE);
                drawRectangle(length, height, '*');
            } else if (system == 3 ) {
                System.out.println("Process fininished with exit code 0 \n");
                drawLine(50, '-');
                System.exit(0);
            }


        }
        
    }

    static void drawLine (int lenght, char e) {
        for (int i = 0; i < lenght; i++) {
            System.out.print(" ");
            System.out.print(e);
            
        }
        System.out.println();
    }
    static void drawRectangle (int length, int height, char e) {
     
        for (int i = 0; i < height; i++) {
           
                System.out.print(e);
                drawLine(length-1, e);
        }
    }
    static int intInputCheck ( int min, int max) {
        
        boolean wrongInput = false;
        int userInput = -1;
        Scanner input = new Scanner(System.in); 
                 
        while (wrongInput == false){
            
            try {
                 
                System.out.println("A integer between " + min + " and " + max);
                userInput = (int)input.nextInt();
                
                
            }
            catch (InputMismatchException e)
            {
                System.out.println("You can not use other than integers");
                input.next();
                continue;
            }catch (NoSuchElementException e) {
                System.out.println("Oops... something went wrong :(");
                input.next();
                System.out.println(" ");

                continue;

            }

            if (userInput < min || userInput > max ) {
                
                System.out.println("You have to use integers as input between " + min + " and " + max);

            } else if (userInput >= min && userInput <= max) {
                
                wrongInput = true;
                
                return userInput;
            }

            

        }
        
        return userInput;
    }
}



