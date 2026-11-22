package Loops;

public class NestedForLoop 
{
    public static void nestedLoop()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.println("i = " + i + " " + "j = " + j);
            }
        } 
    }

    public static void main(String[] args) 
    {
        nestedLoop();
    }
}
