package DSA.TimeAndSpace;

public class TimeAndSpace
{
    public static int findDuplicate(int arr[])
    {
        int result = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] == arr[i + 1])
            {
                return arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 10, 20, 20, 30, 30, 30};

        System.out.println(findDuplicate(arr));
    }
}

/* 
Time complexity: O(n)
Space complexity: O(1) 
*/