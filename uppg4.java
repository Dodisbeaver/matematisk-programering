import java.util.Scanner;



public class uppg4 {
    public static void main(String[] args) {
        int heltal;
        double realtal;
        char tecken;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Ge ett heltal: ");
       
        heltal = input.nextInt();
        System.out.println("Ge ett realtal: ");
        realtal = input.nextDouble();
        System.out.println("Ge ett tecken: ");
        tecken = input.next().charAt(0);

        System.out.println("Heltal: " + heltal);
        System.out.println("Realtal: " + realtal);
        System.out.println("Tecken: " + tecken);

        input.close();
    }
}
