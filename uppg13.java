import java.util.Scanner;

public class uppg13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ange höjden för en triangel: ");
        int height = input.nextInt();

        
            
            for (int e = 0; e < height; e++) {
                
                for(int o = 0; o <e; o++) {
                    System.out.print('*');
                }
                System.out.println('*');
            }
            
        input.close();
    }
}
