import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Gör ett konsolprogram i Java som ber användaren fylla i x antal temperaturvärden. Sedan ska programmet göra det möjligt för användaren att via en meny välja att berkna och visa:

//     maxvärde
//     minvärde
//     medelvärde
//     medianvärde
//     standardavvikelse

// för de inmatade temperaturvärdena.

 

// Tekniska krav

// Alla ovannämnda värden bör beräknas i separa metoder som anropas från main-metoden. Metoderna kan t.ex. heta getMax, getMin, getAverage, getMedian och getStdev. Alla dessa metoder tar in som parameter en referens till den array som innehåller temperaturvärdena och returnerar det värde som ska beräknas. 

 

// Du bör skriva egen kod för att beräkna alla ovannämnda värden men du får givetvis använda Arrays.sort() för sotering och Math.sqrt() för att beräkna kvadratrot.  

 

// Exempelprogramkörning

// En fungerande programkörning kan t.ex. se ut så här (input av användaren skriven som bold text):

// -----------------------------

// TEMPERATURANALYSATORN v0.2

 

// Hur många temperaturvärden vill du mata in?: 5

 

// Ange temperaturvärde 1: -2,5 

// Ange temperaturvärde 2: 22.4

// Ange temperaturvärde 3: 20,3

// Ange temperaturvärde 4: 15,6

// Ange temperaturvärde 5: 17,8

 

// 1. Visa Max

// 2. Visa Min

// 3. Visa medelvärde

// 4. Visa medianvärde

// 5. Visa standardavvikelse

// 6: Avsluta

 

// : 1

// Maxtemperaturen är  22.4

 

// 1. Visa Max

// 2. Visa Min

// 3. Visa medelvärde

// 4. Visa medianvärde

// 5. Visa standardavvikelse

// 6: Avsluta

 

// : 2

// Minimitemperaturen är är  -2.5

 

// 1. Visa Max

// 2. Visa Min

// 3. Visa medelvärde

// 4. Visa medianvärde

// 5. Visa standardavvikelse

// 6: Avsluta

 

// : 3

// Medeltemperaturen är 14.72

 

// 1. Visa Max

// 2. Visa Min

// 3. Visa medelvärde

// 4. Visa medianvärde

// 5. Visa standardavvikelse

// 6: Avsluta

 

// : 4

// Mediantemperaturen är är  17.8

 

// 1. Visa Max

// 2. Visa Min

// 3. Visa medelvärde

// 4. Visa medianvärde

// 5. Visa standardavvikelse

// 6: Avsluta

 

// : 5

// Standardavvikelsen är  8,90

 

// 1. Visa Max

// 2. Visa Min

// 3. Visa medelvärde

// 4. Visa medianvärde

// 5. Visa standardavvikelse

// 6: Avsluta

 

// : 6

// Ha en bra dag!

// --------------------------------------------------¨


public class uppg15 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        int systemStatus = 0;



        System.out.println("*-----------------------------------------------------------------*\nTemperature Observer                            Version alpha 0.2.1\n\n\n");
        System.out.println("How many temperature observations do you have?");
       
        userInput = intInputCheck(0, Integer.MAX_VALUE);
        double observationArray[] = new double[userInput];
        observationArray = arrayFiller(observationArray);

        while (systemStatus != 6) {
          
            System.out.println("\n 1. Show max \n 2. Show min \n 3. Show mean \n 4. Show median \n 5. Show standard deviation \n 6. Exit Program");

            userInput = intInputCheck(1, 6);
            
            if (userInput == 1) {
                System.out.print("Max temperature is: ");
                System.out.printf("%.2f", maxCheck(observationArray));
                System.out.println();
            } else if (userInput == 2 ) {
                System.out.println("Min temperature is: " + minCheck(observationArray));
                System.out.printf("%.2f", minCheck(observationArray));
                System.out.println();
            } else if (userInput == 3 ) {
                System.out.println("Mean temperature is: " + meanCheck(observationArray));
                System.out.printf("%.2f", meanCheck(observationArray));
                System.out.println();
            } else if (userInput == 4 ) {
                System.out.println("Median temperature is: " + medianCheck(observationArray));
                System.out.printf("%.2f", medianCheck(observationArray));
                System.out.println();
            } else if (userInput == 5) {
                System.out.println("Standard deviation is: "  + standardDeviationCheck(observationArray));
                System.out.printf("%.2f", standardDeviationCheck(observationArray));
                System.out.println();
            } else if (userInput == 6 ) {
                System.out.println("Thanks for using Temperature Observer!\nHave a Nice day");
                System.exit(0);
            }
            




        }

        input.close();
    }

    //metod som kollar medelvärdet
    static double meanCheck (double a[]) {

        double meanNr = 0;
        for (int i = 0; i < a.length; i++) {

            meanNr = (a[i] + meanNr);
        }


        meanNr = (meanNr/a.length);

        return meanNr;
    }

// returnerar medianen från en array

    static double medianCheck (double a[]) {

        double median = 0;
        
        if ((a.length%2) == 1) {
                 median = a[((a.length+1)/2)-1];  
                     
        } else {
            median = (a[a.length/2-1]+a[a.length/2])/2;
        }


        return median;
    }

    //kollar minvärdet och returnerar
    static double minCheck (double a[]) {
        double minNr = a[0];
        for (int i = 0; i < a.length; i++) {
            if (minNr > a[i]) {
                minNr = a[i];
            }
        }

        return minNr;
    }

    //kollar maxvärdet och returnerar
    static double maxCheck (double a[]) {
        double maxNr = a[0];
        for (int i = 0; i < a.length; i++) {
            if (maxNr < a[i]) {
                maxNr = a[i];
            }
        }

        return maxNr;
    }
    // kollar standarddeviationen  och returnerar
    static double standardDeviationCheck (double a[]) {
        double standDev = 0, sum = 0, mean = 0, temp = 0;
      
        mean = meanCheck(a);
       
        for (int i = 0; i < a.length; i++) {
     
            sum =  sum + Math.pow((a[i]-mean),2);

        }
        
        mean = sum / (a.length);

        standDev = Math.sqrt(mean);

        return standDev;
    }

    //fyller och returnerar en double array med userinputs
    static double [] arrayFiller (double a[]) {
        
        for (int i = 0; i < a.length; i++){
            System.out.println("Please input the next observation " + (i + 1));
           
            a[i] = userInput();
            
        }

        return a;
    }


    //Fungerande inputcheckare
    static double userInput () {
        boolean wrongInput = false;
        double userInput = 0;
        Scanner input = new Scanner(System.in); 
                 
        while (wrongInput == false){
            
            try {
                 
                
                userInput = (double)input.nextDouble();
                
                return userInput;
                // break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("You can not use anything but numbers");
                input.next();
                continue;
            }catch (NoSuchElementException e) {
                System.out.println("Oops.. something went wrong :(");
                input.next();
                System.out.println(" ");

                continue;

             }
        
            }
            return userInput;
    }
//kollar att användaren inte smättar in någo konstigt
    static int intInputCheck ( int min, int max) {
        
        boolean wrongInput = false;
        int userInput = -1;
        Scanner input = new Scanner(System.in); 
                 
        while (wrongInput == false){
            
            try {
                 
                System.out.println("");
                userInput = (int)input.nextInt();
                
                // break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("You can not use anything but positive integers.");
                input.next();
                continue;
            }catch (NoSuchElementException e) {
                System.out.println("Oops something went wrong :(");
                input.next();
                System.out.println(" ");

                continue;

            }

            if (userInput < min || userInput > max ) {
                
                System.out.println("Please input positive integers");

            } else if (userInput >= min && userInput <= max) {
                
                wrongInput = true;
                
                return userInput;
            }

            

        }
        
        return userInput;
    }
}
