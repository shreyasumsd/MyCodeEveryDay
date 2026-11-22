package DSA.IntArrays;

public class TwoPointers 
{
    public void twoPointers(int[] nums)
    {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right)
        {
            if(left == right)
            {
                System.out.println(nums[left]);
            }
            else
            {
                System.out.println(nums[left] + " ---> " + nums[right]);
            }
            left++;
            right--;
        }
        System.out.println();
    }

    public void startFromCenterAndMoveAway(int[] nums)
    {
        int left;
        int right;

        //even length array

        if(nums.length % 2 == 0)
        {
            left = nums.length/2 - 1; //3rd index
            right = nums.length/2; //4th index
        }
        //odd length array
        else
        {
            left = nums.length/2;
            right = left;
        }
        while(left >= 0 && right < nums.length)
        {
            if(left == right) //avoid repeat
            {
                System.out.println(nums[left]);
            }
            else
            {
                System.out.println(nums[left] + " ---> " + nums[right]); //print both sides
            }
            right ++;
            left --;
        }
    }
 
    public static void main(String[] args) 
    {
        TwoPointers obj = new TwoPointers();
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80};

        obj.twoPointers(nums);
        obj.startFromCenterAndMoveAway(nums);
    }
}
