package Typecasting;
//Day-8 (01-oct-2026)

public class TypeCasting // narrowing 
{
    public static void main(String[] args) 
    {
        /*
        double d = 100.17; 
        int i = (int) d;  //(int) is called typecasting which means narrowing 
        short s = (short)i;
        byte b = (byte)s;


        System.out.println(d);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        */

        int i = 130;
        byte b = (byte)i;  //wrapping from -127 to 128

        System.out.println(i);
        System.out.println(b);


    }
    
}
