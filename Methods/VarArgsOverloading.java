package Methods;

public class VarArgsOverloading
{
    public static void show(int...x)
    {
        System.out.println("Int type");
    }
    public static void show(double...x)
    {
        System.out.println("Double");
    }

    
    public static void main(String[] args) 
    {
        show(10,20);
        show(10.1, 20.1);
    }
}