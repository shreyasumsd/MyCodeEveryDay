package IntegerArrayPQs;

public class Q1FindOddAndEven
{
    public static int[] countOddEven(int a, int b, int c, int d, int e)
    {
        int odd = 0;
        int even = 0;

        int[] numbers = {a,b,c,d,e};

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return new int[]{odd, even};
    }

    public static void main(String[] args)
    {
        int[] result = countOddEven(5, 4, 3, 2, 1);
        System.out.println(java.util.Arrays.toString(result));
    }
}
