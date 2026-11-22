
package Practice;

public class FindMax 
{
    public int getLargestIndex(int[] arr)
    {
        int largest = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
                index = i;
            }
        }

        System.out.println("Largest value: " + largest);
        return index;
    }

    public static void main(String[] args) 
    {
        //int[] arr = {-9, -324, -977, -1, -432};
        //int[] arr = {0, 0, 0, 0, 0}; 
        //int[] arr = {1, 2, 2, 3, 3};
        //int[] arr = {89, 99, 72, 63, 82};
        //int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5};

        FindMax obj = new FindMax();
        int result = obj.getLargestIndex(arr);

        System.out.println("Index of largest value: " + result);
    }
}
