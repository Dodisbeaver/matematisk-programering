import java.util.Scanner;

public class uppg16 {
    public static void main(String[] args) {
        System.out.println("Fyll i ditt fullständinga namn i formatet Förnamnt1 ... FörnamnN Efternamn");

        Scanner keyb = new Scanner(System.in);
     
        String name = keyb.nextLine();
     
      
     
        printAllNames(name);
     
        System.out.println("\nDitt användarnamn: " + getUsername(name));
    }

    static void printAllNames (String name) {
        String[] splitArr = name.split(" ", 5 );

        for (int i = 0; i < splitArr.length; i++) {
            System.out.println(splitArr[i]);
        }

    }

    static String getUsername (String name) {
        String userName = "";

        
        String[] splitArr = name.split(" ", 5);
        if (splitArr[0].length() > 1) {
            userName = userName + splitArr[0].substring(0,1);
        } else {
            userName = splitArr[0];
        }
        
        if (splitArr[splitArr.length-1].length() > 7 ) {
            userName = userName + splitArr[splitArr.length-1].substring(0, 7);
        } else {
            userName += splitArr[splitArr.length-1];
        }
       
        

        return userName;
    }

}
