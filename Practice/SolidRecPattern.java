package Practice;

public class SolidRecPattern 
{
    public static void patternPrint(int inner, int outer) 
    {
        for (int i = 1; i<= inner; i++)
        {
            for (int j = 1; j<= outer; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int inner = 20;
        int outer = 30;
        patternPrint(inner, outer);
    }
    
}
