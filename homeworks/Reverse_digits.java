import java.util.*;

public class Reverse_digits
{
    public static boolean palindrome(int number)
    {
        int original = number;
        int rev = 0;

        while (number != 0)
        {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }

        if (rev == original)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (palindrome(number))
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }

        sc.close();
    }
}