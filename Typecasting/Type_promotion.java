package Typecasting;
public class Type_promotion 
{
    public static void main(String[] args) 
    {
       /* 
        // cant put int in byte ================================
       int a = 10;
       byte b = a;

       System.out.println(b); // error
       */

       // int is stored in int ==================================================
       int i = 11;
       int j = i;
       System.out.println(j);

       //type cast - data loss or not ? ===========================================
       int x = 10;
       byte b = (byte)x;
       System.out.println(b); // no data loss or no error
       
       //type cast and there is data loss ==========================================
        int c = 200;
        byte d = (byte)c;
        System.out.println(d);//no error but data loss

        // long is stored in float ======================================
        long l = 1234567890123456789l;
        float f = l;
        System.out.println(f);
        System.out.println(l);

        double n = l;
        System.out.println(n); // gives more precise output
    }
    
}
/* why java allow this ? (long put in float)
widening is abt range and precision since every long value falls within the range of float
+- 3.4 x 10 e38 
double - 9.1 x 10 e18
java allows long to float even though digits are rounded  */