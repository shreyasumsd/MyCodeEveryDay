package DSA.SearchingAlgorithms;

public class Linear_search 
{
    public void findElement(int[] nums, int key)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(key == nums[i])
            {
                System.out.println("Element is found at index: " + i);
                break;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};

        Linear_search obj = new Linear_search();
        obj.findElement(arr, 30);
    }
}
