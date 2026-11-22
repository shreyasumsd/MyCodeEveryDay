package DSA.Recursion;

public class CountFunCalls
{
    static int count = 0;
    
    public static void countCalls(int n)
    {
        count++;

        if (n == 0)
        {
            return;
        }
        else
        {
            countCalls(n-1);
        }
    }
    
    public static void main(String[] args)
    {
        countCalls(5);

        System.out.println("Recursion count: " + count);
    }
}
