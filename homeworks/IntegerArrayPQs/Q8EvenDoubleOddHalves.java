package IntegerArrayPQs;

public class Q8EvenDoubleOddHalves
{
    public static int[] getDoubleHalves(int[] arr)
    {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                result[i] = arr[i] / 2;
            }
            else
            {
                result[i] = arr[i] * 2;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};

        int[] result = getDoubleHalves(arr);

        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}