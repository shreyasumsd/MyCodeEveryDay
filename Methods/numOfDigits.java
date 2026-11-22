
package Methods;

import java.util.Scanner;

public class numOfDigits 
{
    public static int countDigits(int number)
    {
        int count = 0;
        while (number != 0)
        {
            count++ ;
            number = number / 10;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int result = countDigits(number);

        System.out.println("Number of digits: " + result);

        sc.close();
    }
}
