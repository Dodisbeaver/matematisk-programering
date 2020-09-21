import java.util.Scanner;

public class uppg5 {
    public static void main(String[] args) {
        
        double lenght;
        int weight;
        double bmi;
        Scanner input = new Scanner(System.in);

        System.out.println("Hej, det här programmet räknar ut ditt bmi.");
        System.out.println("Vänligen ge din längd(i meter): ");
        lenght = input.nextDouble();
        System.out.println("Ge också din vikt(i hela kg): ");
        weight = input.nextInt();

        bmi = (double) weight / (lenght*lenght);
        System.out.println(bmi);
        System.out.println(lenght);
        System.out.println(weight);
        if(bmi < 15) {
            System.out.println("Ditt BMI är väldigt lågt," + bmi + ". Du klassas som svältande. Försök att gå upp i vikt");
        }
        else if(bmi <= 18.5) {
            System.out.println("Ditt BMI är lågt, " + bmi + ". Du är undernärd. Försök att gå upp i vikt.");
        }
        else if(bmi >= 18.5 && bmi <= 25) {
            System.out.println("Ditt BMI är normalt," + bmi + ".");
        }
        else if(bmi >= 25 ) {
            
            if (bmi <= 30 ) {
            System.out.println("Ditt BMI är högre än normalt" + bmi + ". Du är överviktig. Ät mindre.");
            }
            else if (bmi > 40) {
                System.out.println("Du är fet" + bmi + ". Banta mera.");
            }
        }
        else 
        System.out.println("Nånting gick fel. Kör på nytt");
        input.close();
    }
}
