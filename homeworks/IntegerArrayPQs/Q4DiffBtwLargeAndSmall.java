
package IntegerArrayPQs;

public class Q4DiffBtwLargeAndSmall
{
    public static int findDifference(int[] arr)
    {
        if (arr == null || arr.length == 0)
        {
            return 0;
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
            } 

            if (arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        return largest - smallest;
    }

    public static void main(String[] args)
    {
        int[] arr = {14, 3, 27, 9};
        // int[] arr = {10, 20, 30};
        // int[] arr = {0, 0, 0, 0, 0, 0, 0};
        // int[] arr = {5};
        // int[] arr = {-10, -20, -30};
        // int[] arr = {10, -20, 30, -40, 50};
        // int[] arr = {100, 200, 300, 400};
        // int[] arr = {5, 5, 5, 5, 5};
        // int[] arr = {-5, 0, 5, 10, -10};
        // int[] arr = {};
        int difference = findDifference(arr);
        System.out.println("The difference is: " + difference);
    }
}
