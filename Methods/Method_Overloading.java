package Methods;

public class Method_Overloading 
{
    // Different number of arguments
    public static void show() 
    {
        System.out.println("Hi");
    }

    public static void show(int a) 
    {
        System.out.println("One Integer");
    }

    public static void show(int a, int b) 
    {
        System.out.println("Two Integer");
    }

    // Different data types
    public static void display(int a) 
    {
        System.out.println("int");
    }

    public static void display(double a) 
    {
        System.out.println("double");
    }

    public static void display(float a) 
    {
        System.out.println("float");
    }

    public static void display(char a) 
    {
        System.out.println("char");
    }

    public static void display(String a) 
    {
        System.out.println("String");
    }

    // Different orders of parameters
    public static void print(int a, double b) 
    {
        System.out.println("int, double");
    }

    public static void print(double a, int b) 
    {
        System.out.println("double, int");
    }

    // Mix everything
    public static void add() 
    {
        System.out.println("No Args");
    }

    public static void add(int a) 
    {
        System.out.println("One int");
    }

    public static void add(int a, int b) 
    {
        System.out.println("Two int");
    }

    // Automatic type promotion
    public static void type(int y) 
    {
        System.out.println("int");
    }

    public static void type(double y) 
    {
        System.out.println("double");
    }

    // Exact match gets highest priority
    public static void exact(int a) 
    {
        System.out.println("int");
    }

    public static void exact(long a) 
    {
        System.out.println("long");
    }

    // Return type
    public static int add1(int a, int b) 
    {
        return a + b;
    }

    // Character promotion
    public static void show1(int a) 
    {
        System.out.println("int");
    }

    public static void show1(char b) 
    {
        System.out.println("char");
    }

    // Parameter names do not matter
    public static void display1(int x) 
    {
        System.out.println("display1");
    }

    // Ambiguity example
    public static void show2(float a) 
    {
        System.out.println("float");
    }

    public static void show2(double a) 
    {
        System.out.println("double");
    }

    public static void main(String[] args) 
    {

        // Different number of arguments
        show();
        show(10);
        show(10, 20);

        // Different data types
        display(10);
        display(10.5);
        display(10.5f);
        display('A');
        display("java");

        // Different orders of parameters
        print(10, 10.5);
        print(10.5, 10);

        // Mix everything
        add();
        add(10);
        add(10, 20);

        // Automatic type promotion
        type(10);
        type(10.5);

        // Exact match
        exact(10);
        exact(10L);

        // Return type
        System.out.println(add1(10, 20));

        // Character promotion
        show1('A');
        show1(65);

        // Parameter names do not matter
        display1(10);

        // Ambiguity example
        show2(10.5f);
        show2(10.5);

        // Uncomment to see the ambiguity error:
        // show2(10);
    }
}
