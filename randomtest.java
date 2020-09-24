public class randomtest {
    public static void main(String[] args) {
        int test = 1;
        int random;
        while (test == 1) {
            
            random = (int) (Math.random() * ((10-1) + 1) + 1);

            System.out.println("häär: " + random);
        }
    }
}
