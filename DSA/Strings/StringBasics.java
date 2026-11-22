package DSA.Strings;

public class StringBasics 
{
    //Create a string, print and find length
    public static void printString()
    {
        String name = "Shreyas";
        System.out.println(name);
        System.out.println(name.length());

        System.out.println();
    }

    //print character in even indices 
    public static void getEvenIndices()
    {
        String str = "Shreyas";
        for (int i = 0; i < str.length(); i += 2)
        {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }

    //print ascii values of all the characters present in your name
    public static void getAsciiValues()
    {
        String name = "Shreyas";

        for (int i = 0; i < name.length(); i++)
        {
            char character = name.charAt(i);
            int ascii = (int) character;
            System.out.println(character + " -> " + ascii);
        }
    }

    //print ascii values of 0 to 9 digits
    public static void findAsciiValues()
    {
        
    }

    //print first character of string
    //print the middle char of odd length input 

    public static void main(String[] args) 
    {
        printString();
        getEvenIndices();
        getAsciiValues();
    }    
}
