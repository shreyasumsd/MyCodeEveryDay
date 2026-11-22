package Methods;

public class Each_Instance 
{
    public void greet() //no args, no return method
    {
        System.out.println("Hello");
    }

    public void printSum(int x, int y) //args, no return
    {
        System.out.println(x+y);
    }

    public int getNumber() //no args, but returns
    {
        return 100;
    }

    public int max(int a, int b) //args and returns
    {
        if(a < b)
            return a;
        else
            return b;   
    }

    public static void main(String[] args) 
    {
        //Multiple object creation for each of the methods
        //one object for one method

        int a = 20, b = 30;

        Instance obj1 = new Instance();
        obj1.greet();

        Instance obj2 = new Instance();
        obj2.printSum(20,30);

        Instance obj3 = new Instance();
        int d = obj3.getNumber();
        System.out.println(d);
        
        Instance obj4 = new Instance();
        int c = obj4.max(a,b);
        System.out.println(c);
    }
}