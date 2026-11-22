package DSA.Strings;

public class BasicsStrings 
{
    /* assign ascii value to a character input --> ? assign --> ? */

    public static void printChar()
    {
        char ch = 66;
        System.out.println("Character of ASCII value: " + ch);

        System.out.println();
    }

    /* take a char as a input 
    print this char as it is 
    print its ascii value */

    public static void printCharInput()
    {
        char cha = 'A';
        System.out.println("Character: " + cha);
        System.out.println("Its ASCII Value: " + (int)(cha));

        System.out.println();
    }

    //Print the next character

    public static void printNextChar()
    {
        char ch = 'a';
        System.out.println("Incremented character: " + (char)(ch + 1));

        System.out.println();
    }
    
    //Print upper to lower

    public static void printUpperToLower()
    {
        char ch = 'A';
        System.out.println("Upper To Lower character: " + (char)(ch + 32));

        System.out.println();
    }

    //lower to upper

    public static void printLowerToUpper()
    {
        char ch = 'a';
        System.out.println("Lower To Upper character: " + (char)(ch - 32));

        System.out.println();
    }

    public static void main(String[] args) 
    {
        printChar();
        printCharInput();
        printNextChar();
        printUpperToLower();
        printLowerToUpper();  
    }    
}
