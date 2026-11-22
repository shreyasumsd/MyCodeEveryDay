package Methods;

public class Instance 
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
        //Single object for all the methods

        Instance obj = new Instance();

        int a = 20, b = 30;
        obj.greet();
        obj.printSum(20,30);

        int d = obj.getNumber();
        System.out.println(d);
        
        int c = obj.max(a,b);
        System.out.println(c);
    }   
}