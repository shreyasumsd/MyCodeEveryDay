package DSA.Sorting;

public class SelectionSort 
{
    public static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int []arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length - 1; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            //swap once
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            //display arr after every pass
            System.out.print("\npass " + (i+1) + " : ");
            printArray(arr);
        }
    }

    public static void main(String[] args) 
    {
        int [] arr = {9, 8, 3, 4,6,8,4,5,3,7};

        System.out.print("Before sorting: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("After sorting");
        printArray(arr);

        
    }  
}
