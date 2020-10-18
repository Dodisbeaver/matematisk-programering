public class DoubleArrayFiller {
    double array [];

   void setArrayLenght(int i) {
    array = new double[i];
    }

    void fillArray() {
        DoubleUserInput userInput = new DoubleUserInput();
        for (int i = 0; i < array.length; i++){
            System.out.println("Please input the next double " + (i + 1));
            userInput.setUserInput();
            array[i] = userInput.getUserInput();
            
        }
    }
}
