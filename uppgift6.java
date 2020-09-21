import java.util.Scanner;

public class uppgift6 {
    public static void main(String[] args) {
        System.out.println("Hejsan, vänligen mata in en radie.");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double circumfence = 2 * Math.PI * radius;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Cirkelns omkrets är: " + circumfence + "\n och cirkelns area är: " + circleArea);

        input.close();
    }

}
