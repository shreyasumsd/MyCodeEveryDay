package IntegerArrayPQs;

public class Q5StudentPass 
{
    public static void passStatus(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 35)
            {
                System.out.println("passed");
            }
            else
            {
                System.out.println("failed");
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {40, 22, 35, 90, 18};
        passStatus(arr);
    }
}