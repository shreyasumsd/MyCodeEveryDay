package IntegerArrayPQs;

import java.util.Arrays;

public class Q3ReturnNumGreLess
{
    public static int[] getNumbers(int[] arr)
    {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 50 && arr[i] < 100)
            {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 50 && arr[i] < 100)
            {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = {45, 67, 100, 52, 99, 120, 50};

        int[] output = getNumbers(arr);

        System.out.println(Arrays.toString(output));
    }
}