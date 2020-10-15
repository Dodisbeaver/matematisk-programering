import java.util.Scanner;

public class uppg16 {
    public static void main(String[] args) {
        System.out.println("Fyll i ditt fullständinga namn i formatet Förnamnt1 ... FörnamnN Efternamn");

        Scanner keyb = new Scanner(System.in);
     
        String name = keyb.nextLine();
     
      
     
        printAllNames(name);
     
        System.out.println("\nDitt användarnamn: " + getUsername(name));
    }
// printar alla namn från en array

    static void printAllNames (String name) {
        String[] splitArr = name.split(" ", 5 );

        for (int i = 0; i < splitArr.length; i++) {
            System.out.println(splitArr[i]);
        }

    }

    //printar ett username från 2 av förnamn bokstäver och av efternamn om det finns 7 bokstäver 
    static String getUsername (String name) {
        String userName;

        
        String[] splitArr = name.split(" ", 5);
        if (splitArr[0].length() > 1) {
            userName = splitArr[0].substring(0,1);
        } else {
            userName = splitArr[0];
        }
        
        if (splitArr[splitArr.length-1].length() >= 7) {
            userName = userName + splitArr[splitArr.length-1].substring(0, 7);
        } else {
            userName = userName + splitArr[splitArr.length-1];
        }
       
        return nordicEraser(userName);
    }

    //metod som byter ut å ä ö
    static String nordicEraser (String name) {
        String newName = name.replaceAll("ö", "o");
        newName = newName.replaceAll("Ö", "O");
        newName = newName.replaceAll("ä", "a");
        newName = newName.replaceAll("Ä", "A");
        newName = newName.replaceAll("å", "a");
        newName = newName.replaceAll("Å", "A");        
        
        return newName;
    }
}
