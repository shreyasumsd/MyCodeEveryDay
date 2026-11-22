package DSA.IntArrays;

public class OriginalArrayChanges 
{
    //Print array as it is -- Original array
    static void printArray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++ )
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static void change(int[] x)
    {
        System.out.println("Before change");

        printArray(x);
        x[0] = 999;
    
        System.out.println("After change");
        printArray(x);
    }

    public static void main(String[] args) 
    {
        int[] a = {10, 20, 30};
        // int[] a = {0, 0, 0, 0, 0, 0, 0};
        // int[] a = {5};
        // int[] a = {-10, -20, -30};
        // int[] a = {10, -20, 30, -40, 50};
        // int[] a = {100, 200, 300, 400};
        // int[] a = {5, 5, 5, 5, 5};
        // int[] a = {-5, 0, 5, 10, -10};
        // int[] a = {};


        System.out.println("Before calling");
        printArray(a);
        change(a);

        System.out.println("After Calling change");
        printArray(a);
    }
    
}
