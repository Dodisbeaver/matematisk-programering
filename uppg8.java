import java.util.Scanner;





public class uppg8 {
    public static void main(String[] args) {
        double cathetusA = 0;
        double cathetusB = 0;
        double hypotenus = 0;
        double angle = 0;
        int knowingCount = 0;
        Scanner input = new Scanner(System.in);

        //while loop som körs så länge värden är minst två och högst två
        while (knowingCount < 2 || knowingCount > 2) {

           
            knowingCount = 0;
            System.out.println("Ge längden på den närliggande kateten(0 om du inte känner till): ");
             cathetusA = input.nextDouble();
             if (cathetusA != 0) knowingCount++;
    
            System.out.println("Ge längden på den närliggande kateten(0 om du inte känner till): ");
             cathetusB = input.nextDouble();
             if (cathetusB != 0) knowingCount++;
    
            System.out.println("Ge längden på hypotenusan(0 om du inte känner till): ");
             hypotenus = input.nextDouble();
             if(hypotenus != 0) knowingCount++;
            System.out.println("Ge vinkeln du känner till(0 om du inte känner till): ");
             angle = input.nextDouble();
             if(angle != 0) knowingCount++;


             
             if(knowingCount < 2 || knowingCount > 2) System.out.println("Vänligen ge minst/högst 2 värden för att beräkningarna skall kunna utföras.");
        }
        input.close();
        
        // if sats som hittar kateten om vi vet åtminstone en katet och hypotes
        if(cathetusA == 0 || cathetusB == 0 && hypotenus != 0){
            if (cathetusA == 0 && cathetusB == 0){
                cathetusA = calcCathetus( true, angle, hypotenus);
                cathetusB = calcCathetus( false, angle, hypotenus);
            }else if (cathetusA == 0 && cathetusB != 0 && hypotenus != 0) {
                cathetusA = pythagoras(cathetusA, cathetusB, hypotenus);
                
            } else if (cathetusB == 0 && cathetusA != 0 && hypotenus != 0) {

                cathetusB = pythagoras(cathetusA, cathetusB, hypotenus);
            }

            
        }

        // if sats som hittar hypotenusan 
        if(hypotenus == 0 && (cathetusA != 0 || cathetusB != 0)) {
            hypotenus = calcHypotenus(cathetusA, cathetusB, angle);
            
            if(cathetusA == 0) {cathetusA = pythagoras(cathetusA, cathetusB, hypotenus);}

            if(cathetusB == 0) {cathetusB = pythagoras(cathetusA, cathetusB, hypotenus);}
        }
        //if sats som till sist hittar vinkeln
        if(angle == 0) {
            angle = calcAngle(cathetusA, cathetusB, hypotenus);
        }


        System.out.println("Närliggande katet: " + cathetusA);
        System.out.println("Motstående katet: " + cathetusB);
        System.out.println("Hypotenusan: " + hypotenus);
        System.out.println("Vinkeln: " + angle);

    }
    
    //metod som beräknar hypotenusan via pytagoras eller katet och vinkel
    static double calcHypotenus (double cathetusA, double cathetusB, double angle) {
        double hypotenus = 0;
        if(cathetusA != 0 && cathetusB != 0) {
            
            return hypotenus = pythagoras(cathetusA, cathetusB, hypotenus);
        }
        else if (cathetusA != 0 && angle != 0) {
            hypotenus = cathetusA / Math.cos(Math.toRadians(angle));
            return hypotenus;
        }
        else if (cathetusB != 0 && angle != 0) {
            hypotenus = cathetusB / Math.sin(Math.toRadians(angle));
            
            return hypotenus;
        }
        
               
                
        return hypotenus;
    }
    //metod för beräkning av vinkeln via katet och hypotenusa
   static  double calcAngle (double cathetusA, double cathetusB, double hypotenus) {
        double angle = 0;

        if(cathetusA != 0 && cathetusB != 0) {
            angle = Math.toDegrees(Math.atan(cathetusB/cathetusA));
            
            return angle;
        }
        else if (cathetusA != 0 && hypotenus != 0) {
            angle = Math.acos(cathetusA/hypotenus);
            return angle;
        }
        else if (cathetusB != 0 && hypotenus != 0) {
            angle = Math.asin(cathetusB/hypotenus);
            return angle;
        }


        return angle;
    }
    //metod som beräknar kateten med hypotenusan och vinkeln
    static double calcCathetus( boolean notCos, double angle, double hypotenus) {

        if(!notCos ){
            
            return Math.sin(Math.toRadians(angle))*hypotenus;
        }else
        return Math.cos(Math.toRadians(angle))*hypotenus;
        

    }
    //Metod som beräknar med pythagoras sats ett värde.
    static double pythagoras (double a, double b, double c){
        // a2 + b2 = c2
        if (a == 0) {
            
            return a = Math.sqrt((c*c)-(b*b));
        }
        else if (b == 0) {
            
            return b = Math.sqrt((c*c)-(a*a));
        }

        
        return c = Math.sqrt(a*a + b*b);
    }
}