import java.util.Scanner;

public class uppg8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ge längden på den närliggande kateten(0 om du inte känner till): ");
        double cathetusA = input.nextDouble();
        System.out.println("Ge längden på den närliggande kateten(0 om du inte känner till): ");
        double cathetusB = input.nextDouble();
        System.out.println("Ge längden på hypotenusan(0 om du inte känner till): ");
        double hypotenus = input.nextDouble();
        System.out.println("Ge vinkeln du känner till(0 om du inte känner till): ");
        double vinkel = input.nextDouble();
        

    }
    
    
    double calcHypotenus (double cathetusA, double cathetusB, double angle) {
        double hypotenus;
        if(cathetusA != 0 && cathetusB != 0) {
            hypotenus = Math.sqrt(cathetusA*cathetusA + cathetusB * cathetusB);
        }
        else if (cathetusA != 0 && angle != 0) {
            hypotenus = cathetusA / Math.cos(Math.toRadians(angle));
        }
        else if (cathetusB != 0 && angle != 0) {
            hypotenus = cathetusB / Math.sin(Math.toRadians(angle));
        }
        
               
                
        return hypotenus;
    }
    
    double calcAngle 

}