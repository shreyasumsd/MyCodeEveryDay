package DSA.Sorting;

import java.util.*;

public class QuickSort 
{
    public static int partition(int[] a, int low, int high) 
    {
        int pivot = a[low];
        int i = low + 1;
        int j = high;

        while (i <= j) 
        {
            while (i <= high && a[i] <= pivot)
            {
                i++;
            }

            while (j >= low + 1 && a[j] > pivot) 
            {
                j--;
            }

            if (i < j) 
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }
        }

        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;
    }

    public static void quickSort(int[] a, int low, int high) 
    {
        if (low < high) 
        {
            int pivotIndex = partition(a, low, high);

            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) 
    {
        int[] a = {50, 80, 20, 70, 30, 60, 10, 40};

        quickSort(a, 0, a.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
}

/* public static int partition(int[] arr, int low, int high) {

    int pivot = arr[low];          // First element is chosen as pivot
    int leftPointer = low + 1;     // Starts from next element
    int rightPointer = high;       // Starts from last element

    while (leftPointer <= rightPointer) {

        // Move leftPointer until an element greater than pivot is found
        while (leftPointer <= high && arr[leftPointer] <= pivot) {
            leftPointer++;
        }

        // Move rightPointer until an element smaller than or equal to pivot is found
        while (rightPointer >= low + 1 && arr[rightPointer] > pivot) {
            rightPointer--;
        }

        // Swap misplaced elements
        if (leftPointer < rightPointer) {
            int temp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = temp;
        }
    }

    // Place pivot in its correct position
    int temp = arr[low];
    arr[low] = arr[rightPointer];
    arr[rightPointer] = temp;

    return rightPointer; // Pivot index
} */