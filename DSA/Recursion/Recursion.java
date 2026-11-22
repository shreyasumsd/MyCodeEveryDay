package DSA.Recursion;

public class Recursion 
{
    public static void fun(int n)
    {
        if(n > 0)
        {
        fun(n-1);
        System.out.println(n);
        }
    }
    

    //recursion should stop always - or it goes to infinite loop

    public static void main(String[] args) 
    {
        fun(3);
    }
}
