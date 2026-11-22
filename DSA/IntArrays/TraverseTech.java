package DSA.IntArrays;

public class TraverseTech 
{
    public void printRevArray(int[] nums)
    {
        System.out.println("\nPrint Reverse array");
        for (int i = nums.length - 1; i >= 0; i--)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    void printIndexValue(int[] nums)
    {
        System.out.println("\nPrint Index Value");
        for(int i = 0; i <= nums.length-1; i++)//left to right single pointer
        {
            System.out.println("Index: " + i + " Value: " + nums[i] );
        }
        System.out.println();
    }

    void printFirstHalf(int[] nums)
    {
        System.out.println("\nFirst half of array");
        for (int i = 0; i < nums.length/2; i++)
        {
            System.out.print(nums[i] + " "); 

        }
        System.out.println();
    }

    // second half homework

    void printAlternate(int [] nums)
    {
        System.out.println("\nPrint alternate from start");
        for(int i = 1; i < nums.length; i += 2)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    void printAlternateEnd(int [] nums)
    {
        System.out.println("\nPrint alternate from End");
        for(int i = nums.length-1; i >= 0; i -= 2)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    void printEvenIndex(int[] nums)
    {
        System.out.println("\nPrint Even Index Value");
        for(int i = 0; i < nums.length; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
    }

    void printOddIndex(int[] nums)
    {
        System.out.println("\nPrint Odd Index Value");
        for(int i = 0; i < nums.length; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
    }

    void printGreaterThanGiven(int[] nums, int number)
    {
        System.out.println("\nPrint Greater Than Given");
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > number)
            {
                System.out.println(nums[i] + " ");
            }
        }
    }

    //btwn given elements

    void printBtwnGivenElement(int[]nums, int num1, int num2)
    {
        System.out.println("\nPrint Btwn Given Element");
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > num1 && nums[i] < num2)
            {
                System.out.println(nums[i] + " ");
            }
        }
    }

    void printElementsDivByNum(int[]nums, int number)
    {
        System.out.println("\nPrint Divisible by number");
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % number == 0)
            {
                System.out.println(nums[i] + " ");
            }
        }
    }

    //multiple of 20 then print
    //even idre 

    public static void main(String[] args) 
    {
        TraverseTech obj = new TraverseTech();

        int [] nums = {10, 20, 30, 40};

        obj.printRevArray(nums);
        obj.printIndexValue(nums);
        obj.printFirstHalf(nums);
        obj.printAlternate(nums);
        obj.printAlternateEnd(nums);
        obj.printEvenIndex(nums);
        obj.printOddIndex(nums);
        obj.printGreaterThanGiven(nums, 2);
        obj.printBtwnGivenElement(nums,10,20);
        obj.printElementsDivByNum(nums, 20);
    }
}
