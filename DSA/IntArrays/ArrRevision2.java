package DSA.IntArrays;

public class ArrRevision2 
{
    /* ur given a int arr with duplicate elements update the 
    arr --in place-- such that it has only unique elements */

    public int keepUniqueElements(int[] arr) 
    {
        if (arr == null || arr.length == 0) 
        {
            return 0;
        }

        int uniqueCount = 1;

        for (int readIndex = 1; readIndex < arr.length; readIndex++)
        {
            if (arr[readIndex] != arr[uniqueCount - 1])
            {
                arr[uniqueCount] = arr[readIndex];
                uniqueCount++;
            }
        }

        for (int i = uniqueCount; i < arr.length; i++)
        {
            arr[i] = 0;
        }

        return uniqueCount;

        
    }

    public static void main(String[] args) 
    {
        // int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 8, 8};
        int[] arr = {1,1,1,1,1,1,1,1,1};
        //int[] arr = null;
        // int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 3, 4};
        // int[] arr = {2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        // int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4};
        // int[] arr = {5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8};
        // int[] arr = {-5, -5, -3, -3, -1, -1, 0, 0, 2, 2};
        // int[] arr = {10, 10, 20, 20, 30, 30, 40, 40, 50, 50};
        // int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        // int[] arr = {1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5};
        // int[] arr = {0, 0, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5};


        ArrRevision2 obj = new ArrRevision2();
        int result = obj.keepUniqueElements(arr);

        System.out.println("unique elements:");
        for (int i = 0; i < result; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Total unique elements: " + result);
    }
}