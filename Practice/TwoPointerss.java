package Practice;

public class TwoPointerss 
{
    public static void learnPointers(int arr[])
    {
        int left = 0;
        int right = arr.length -1;

        while(left <= right)
        {
            if(arr[left] == arr[right])
            {
                System.out.println(arr[left]);
            }
            else
            {
                System.out.println(arr[left] + "---->"  + arr[right]);
            }
            left++;
            right--;
        }
        System.out.println();
    }

    public static void learnCenter(int arr[])
    {
        int left =0;
        int right =0;

        if(arr.length % 2 == 0)
        {
            left = arr.length/2 - 1;
            right = arr.length/2;
        }
        else
        {
            left = arr.length/2;
            right = left;
        }

        while(left >= 0 && right < arr.length )
        {
            if(left == right)
            {
                System.out.println(arr[left]);
            }
            else
            {
                System.out.println(arr[left] + "---->"  + arr[right]);
            }
            left--;
            right++;
        }
    }

    public static void main(String[] args) 
    {
        int arr[] ={10, 20, 30, 40, 50, 60, 70, 80};
        learnPointers(arr);

        learnCenter(arr);
    }
    
}
