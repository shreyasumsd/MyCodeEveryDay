package DSA.Sorting;

public class BubbleSort 
{
    public void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) 
    {
        int[] array = {5, 4, 3, 7, 9, 8, 6, 2, 1, -3, 10};

        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(array);
    }
}
