package IntegerArrayPQs;

public class Q7WeekOfTemperatures 
{
    public static int findTemperature(int[] arr)
    {
        if (arr == null || arr.length == 0)
        {
            return 0;
        }

        int count = 0;

        for(int i = 1; i < arr.length; i ++)
        {
            if (arr[i] > arr[i - 1])
            {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int[] arr = {30, 31, 30, 34, 32, 36, 36};
        int result = findTemperature(arr);
        System.out.println("Days were hotter than the day before are: " + result);
    }
    
}
