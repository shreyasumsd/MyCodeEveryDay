package JavaFundamentals;
public class InrDivVSFloatDiv 
{
    public static void main(String[] args) 
    {
        //integer division 
        int a = 7;
        int b = 2;

        System.out.println("Integer Division: " +(a/b)); // 7/2=3

        //Floating Division
        float x = 2;
        float y = 3;

        System.out.println("Float Divivsion: "+(x/y));

        //double Division
        float p = 2;
        float q = 3;

        System.err.println("Float Divivsion: "+(p/q));

        //typecaste and divide 
        System.err.println("Float div int: " + ((float)(a)/b));
        System.err.println("Float div int: " + (a/(float)b));
        System.err.println("Float div int: " + ((double)(a)/b));
        System.err.println("Float div int: " + (a/(double)b));

        //any one is double or float the ans will be float/double

        //some more combinations
        System.out.println(7/2);
        System.out.println(7.0/2);
        System.out.println(7/2.0);
        System.out.println(7.0/2.0);
        


    }
    
}
