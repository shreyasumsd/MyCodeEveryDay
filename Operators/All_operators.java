package Operators;

public class All_operators 
{
    public static void main(String[] args) 
    {
        //In java relational operators return true or false only

        System.out.println("Relational Operators: Comparison");
        int e = 20;
        int f = 10;

        System.out.println(e > f);
        System.out.println(e < f);
        System.out.println(e >= f);
        System.out.println(e <= f);
        System.out.println(e == f);
        System.out.println(e != f);

        System.out.println();

        //Logical operators

        System.out.println("Logical Operators");
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        System.out.println();

        //Compound Operators - JAVA does automatic typecasting for this operators

        System.out.println("Compound operators");
        int h =10;
        h += 5;

        System.out.println(h);

        h -= 3;
        System.out.println(h);

        h *= 2;
        System.out.println(h);

        h /= 6;
        System.out.println(h);
        
        h %= 3;
        System.out.println(h);

        System.out.println();

        //turnary Operators

        System.out.println("Turnary Operator");

        int i = 10;
        int j = 40;

        // syntax --> datatype variable_name = (Condition check) ? is it true : false  
        int max = (i < j)? i : j;

        System.out.println(max);
    }
}