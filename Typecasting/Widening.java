package Typecasting;
//Day-8 (01-oct-2026)

public class Widening 
{
    public static void main(String[] args) 
    {
        byte b = 10;
        int i = b; // loss of data 

        long l = i; // int putting into long -----> no loss
        float f = l; // long putting into float -----> no loss
        double d = f; // float putting into double -----> no loss

        System.out.println(b);
        System.out.println(i);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);

    }
    
}
