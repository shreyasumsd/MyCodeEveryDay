package JavaFundamentals;
//Day-4 (25-sept-2026)

public class debugging {

    public static int addition(int n1, int n2)
    {
        int sum = n1 + n2;
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Welcome to algorithms");
        System.out.println("You can learn coding in a month");

        int number1 = 10;
        int number2 = 20;

        int sum = addition(number1, number2);
        System.out.println("sum = " + sum);
    }
}