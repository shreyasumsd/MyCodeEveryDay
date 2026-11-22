package DSA.SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearch 
{
    static int findNumbers(int[] numbers, int key)
    {
        if(numbers == null)
        {
            System.out.println("array ref is null");
            return -1;
        }

        //edge case -2 
        if(numbers.length == 0)
        {
            System.out.println("Array is empty");
            return 0;
        }

        int low = 0;
        int high = numbers.length-1;

        while(low <= high)
        {
            int mid = low + (high - low) /2;

            if(numbers[mid] == key)
            {
                return mid;
            }
            else if(key < numbers[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        //if not found
        return -1;
    }
    
    public static void main(String[] args) 
    {
        int[]arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to search");
        int key = sc.nextInt();

        int index = findNumbers(arr, key);
        if(index != -1)
        {
            System.out.println("Element is found at index: " + index);

        }
        else
        {
            System.out.println("Element not found");
        }

        sc.close();
    }
}