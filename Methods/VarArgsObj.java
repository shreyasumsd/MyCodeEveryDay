package Methods;
//pass diff data type together using obj
public class VarArgsObj 
{
    static void show(Object...obj)
    {
        for (Object x : obj)
        {
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) 
    {
       show(101,"Rahul", 92.5, true, 'A');
        
    }
}
