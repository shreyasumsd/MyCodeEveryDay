package Practice;

public class JustFile 
{
    public void getSortBubble()
    {
        for(int i = 1; i < 10; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printPatterns()
    {
        for(int i = 4; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        JustFile obj = new JustFile();
        obj.getSortBubble();  
        obj.printPatterns(); 
    } 
}