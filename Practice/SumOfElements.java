package Practice;

public class SumOfElements
{
    public static int getSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            System.out.println(sum);
            
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int[] array = {10, 20, 30, 40};
        int result = getSum(array);
        System.out.println(result);

    }
}