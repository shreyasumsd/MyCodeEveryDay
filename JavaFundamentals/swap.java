package JavaFundamentals;
//Day-6 (29-sept-2026)

public class swap {
    public static void main(String args[]) {

        int a = 20;
        int b = 30;
        int temp;

        System.out.println("Before Swapping: " + a + "," + b);
        
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: " + a + "," + b);

        int x = 10;
        System.out.println(++x);
    }
    
}