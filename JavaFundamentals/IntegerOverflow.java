package JavaFundamentals;
public class IntegerOverflow {
    public static void main(String[] args) {
        
        byte value = 127;
        System.out.println(value); //127

        value++;
        System.out.println(value); // -128

    }
    
}
