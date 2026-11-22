package Operators;
public class Increment_Decrement {
    public static void main(String[] args) 
    {
        
        // ================ Section - 1 =======================
        System.out.println("Section 1 - Post increment and pre increment: ");

        int a = 10;

        System.out.println(a++); // 10 and 11
        System.out.println(a); // 11

        System.out.println(a++); //11
        System.out.println(a); //12

        System.out.println(++a); //13
        System.out.println(a); // 13

        System.out.println(a++); //13
        System.out.println(a); //14

        System.out.println();

        // ================ Section - 2 =======================
        System.out.println("Section 2 - Post decrement and pre decrement: ");

        int b = 14;

        System.out.println(b--);
        System.out.println(b);

        System.out.println(--b);
        System.out.println(b);

        System.out.println(b--);
        System.out.println(b);

        System.out.println(b--);
        System.out.println(b);

        System.out.println();

         // ================ Section - 3 =======================
        System.out.println("Section 3 - Assignment with post Increment: ");

        int c = 10;
        int d = c++;

        System.out.println(d); //10
        System.out.println(c); //11

        System.out.println();

        // ================ Section - 4 =======================
        System.out.println("Section 4 - Assignment with pre Increment: ");

        int e = 10;
        int f = ++e;

        System.out.println(e); //11
        System.out.println(f); //11

        System.out.println();

        // Home work -  take input, assign with decrement (pre and post)

        // ================ Section - 5 =======================
        System.out.println("Section 5 - Simple expression: ");

        int g = 10;
        
        System.out.println(g++ + 5); //15
        System.out.println(g); //11

        System.out.println(++g + 5); //17
        System.out.println(g); //12

        System.out.println();

        // ================ Section - 6 =======================
        System.out.println("Section 6 - Complex expression: ");;

        int h = 10;

        System.out.println(h++ + ++h); //10 + 12
        System.out.println(h++ - ++h); //22 - 
        System.out.println(++h - ++h);
        System.out.println(++h - h++);
        System.out.println(h);
        System.out.println(++h - --h);
        System.out.println(h);
        
        System.out.println();

        // Home work - mix the expression ++ + -- 

        // ================ Section - 7 =======================
        System.out.println("Section 7 - Char Increment: ");

        char ch1 = 'A';
        
        System.out.println(ch1++);
        System.out.println(ch1);

        System.out.println(++ch1);
        System.out.println(ch1);

        System.out.println();

        // home work character decrement
        // home work character and acsii all unique code 

        // ================ Section - 8 =======================
        System.out.println("Section 8 - character and acsii all unique code: ");

        char ch2 = '9'; // unicode 58
        
        System.out.println(++ch2);
        System.out.println(ch2);

        
        System.out.println();

        // ================ Section - 9 =======================
        System.out.println("Section 9 - Boolean: Wont be compiled bcoz ++ and -- cant be increment and decrement ");

        /* boolean flag = true;
        flag++;
        ++flag;
        flag--;
        --flag; */

        System.out.println();

        // ================ Section - 10 =======================
        System.out.println("Section 10 - Literals -- Fixed values: cant be compiled, we get error ");

        System.out.println("++ and -- can be applied to variables only not literals");

        /* System.out.println(10++);
        System.out.println(++10); */

        System.out.println();
    }
}
