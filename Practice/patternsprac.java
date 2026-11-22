package Practice;

public class patternsprac 
{
    public static void printPatterns()
    {
        int i= 0;
        int j= 0;

        for(i = 0; i < 10; i++)
        {
            for(j = 2; j<11; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printEvenIncreasingOrder()
    {
        for (int i =1;  i<= 100; i++)
        {
            if(i %2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 100;  i>= 1; i--)
        {
            if(i %2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
    

    public static void main(String[] args) 
    {
        printPatterns();
        printEvenIncreasingOrder();
    }    
}
