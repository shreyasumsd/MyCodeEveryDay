
package DSA.IntArrays;

public class ArrRevision1 
{
    // Finds the sum of numbers ending with a given digit
    public int getSumOfNumberEndingWithDigit(int[] num, int digit)
    {
        if (num == null || num.length == 0)
        {
            return -1;
        } 

        int sum = 0;
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] % 10 == digit)
            {
                sum = sum + num[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int[] array = {23, 454, 94, 21, 9, 4};

        ArrRevision1 obj = new ArrRevision1();
        int result = obj.getSumOfNumberEndingWithDigit(array, 4);

        System.out.println("Sum = " + result);
    } 
}

// ur given a int arr with duplicate elements update the arr in place such that it has only unique elements