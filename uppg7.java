import java.util.Scanner;

public class uppg7 {
    public static void main(String[] args) {
        System.out.println("Hejsan, det här programmet räknar ut hypotenusan av en rätvinklig triangel. \n Vilken katet känner du till?(a = 1 b=2): ");
        Scanner input = new Scanner(System.in);
        double katet = input.nextInt();
        double vinkel;

        if(katet == 1) {
            
            System.out.println("Ge längden på den närliggande kateten: ");
            katet = input.nextDouble();
            System.out.println("Ge vinkeln du känner till: ");
            vinkel = input.nextDouble();
            
            double hypotenus = katet / Math.cos(Math.toRadians(vinkel));
            System.out.println("Hypotenusans längd är: " + hypotenus);

            System.exit(0);
            
        }
        else
        System.out.println("Ge längden på den motstående kateten: ");
        katet = input.nextDouble();
        System.out.println("Ge vinkeln du känner till: ");
        vinkel = input.nextDouble();
        double hypotenus = katet / Math.sin(Math.toRadians(vinkel));
        System.out.println("Hypotenusans längd är: " + hypotenus);

        input.close();

    }
}
