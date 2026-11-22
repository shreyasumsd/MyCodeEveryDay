package Methods;

public class VarArgs 
{
    static void show(int...x) // 10, 20, 30
    {
        System.out.println("Count of elements: " + x.length);

        for(int i = 0; i<x.length; i++)
        {
            System.out.println(x[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        show();
        show(10);
        show(10,20);
        show(10,20,30);
    }
    
}
