package IntegerArrayPQs;

public class Q6SumOfPosition 
{
    public static int findSum(int arr[])
    {
        if (arr == null || arr.length == 0)
        {
            return 0;
        }

        int sum = 0;
        for(int i = 0; i <= arr.length; i += 2)
        {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 83, 1, 67, 1};
        // int[] arr = {14, 3, 27, 9};
        // int[] arr = {10, 20, 30};
        // int[] arr = {0, 0, 0, 0, 0, 0, 0};
        // int[] arr = {5};
        // int[] arr = {-10, -20, -30};
        // int[] arr = {10, -20, 30, -40, 50};
        // int[] arr = {100, 200, 300, 400};
        // int[] arr = {5, 5, 5, 5, 5};
        int[] arr = {-5, 0, 5, 10, -10};
        // int[] arr = {};
        int result = findSum(arr);
        System.out.println(result);

    }
    
}
