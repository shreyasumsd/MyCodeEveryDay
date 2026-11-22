import java.util.*;

public class larger_2_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();

        int largest = (a > b) ? a : b ;
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}
