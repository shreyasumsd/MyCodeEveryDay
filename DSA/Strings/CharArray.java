package DSA.Strings;

public class CharArray 
{
    //print default values using loops
    public static void printDefaultValues()
    {
        char temp[] = new char[5];
        
        for(int i =0; i<temp.length; i++) //without loop also can be done
        {
            System.out.println("Default Values: " + temp[i] + " ");
        } 
        System.out.println();
    }

    //Create char arr and initialize abcd print using loop
    public static void printLengthOfChar()
    {
        char temp[] = {'A','B'};
        
        System.out.println(temp.length);

        System.out.println();
    }

    //demonstrate ascii values stored as characters
    public static void printAsciiOfChar()
    {
        char temp[] = {65, 66, 67, 68};
        
        for(int i =0; i<temp.length; i++)
        {
            System.out.println(temp[i] + " ");
        }

        System.out.println();
    }

    // partial initialization
    public static void printPartialChar()
    {
        char temp[] = new char[5];
        temp[0] = 'A';
        System.out.println(temp[0]);
    }

    public static void main(String[] args) 
    {
        printDefaultValues();
        printLengthOfChar();
        printAsciiOfChar();
    }    
}
