public class Stack_frames 
{
    static void A()
    {
        B();
    }

    static void B()
    {
        C();
    }

    static void C()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) 
    {
        A();
    }    
}