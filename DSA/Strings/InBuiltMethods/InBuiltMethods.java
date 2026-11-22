package DSA.Strings.InBuiltMethods;

public class InBuiltMethods 
{
    /* toCharArray()
    Convert string into array
    need: as strings are immutable we were in need of conv to char array
    Syntax: char[] arr = str.toCharArray(); */

    public static void demoToCharArray() 
    {
        String name = "Algo";

        char[] arr = name.toCharArray();

        System.out.println("Original: " + name);
        System.out.println("Char Array: ");

        for (char ch : arr)
        {
            System.out.println(ch + " ");
        }
        System.out.println();
    }

    //equals() --> compares to strings exact equality
    //actually equals compare the contents 
    // Syntax: str1.equals(str2) --> str1 = java, str2 = Java
    // equals see even case sensitive letters too
    
    public static void demoEquals()
    {
        String Str1 = "java";
        String Str2 = "Java";
        String Str3 = "java";

        System.out.println(Str1.equals(Str2));
        System.out.println(Str1.equals(Str3));

        System.out.println();
    }

    //equalsIgnoreCase() -- compares two strings but wont consider case sensitive letters
    //upper case and lower case letters are treated as equal
    //Syntax: str1.equalsIgnoreCase(str2)

    public static void demoEqualsIgnoreCase()
    {
        String Str1 = "java";
        String Str2 = "Java";
        String Str3 = "java";

        System.out.println(Str1.equalsIgnoreCase(Str2));
        System.out.println(Str1.equalsIgnoreCase(Str3));

        System.out.println();
    }

    //compareTo() -- compares strings lexicographically\
    //returns: 0 if strings are equal 
    // <0 -- if first string comes bfr second
    // >0 -- if first string comes afr second
    //comparison based on unicode values
    //syntax: str1.compareTo(str2);

    public static void demoCompareTo()
    {
        String Str1 = "Apple";
        String Str2 = "Banana";
        String Str3 = "Apple";
        String Str4 = "App";

        System.out.println(Str1.compareTo(Str4));
        System.out.println(Str1.compareTo(Str2));
        System.out.println(Str1.compareTo(Str3));
        System.out.println(Str2.compareTo(Str1));

        System.out.println();
    }

    // compareToIgnoreCase

    public static void demoCompareToIgnoreCase()
    {
        String Str1 = "Java";
        String Str2 = "java";
        String Str3 = "Python";

        System.out.println(Str1.compareToIgnoreCase(Str2));
        System.out.println(Str1.compareToIgnoreCase(Str3));
        System.out.println(Str2.compareToIgnoreCase(Str1));

        System.out.println();
    }

    //ToLowerCase
    public static void convertToLowerCase()
    {
        String str = "JAVA";
        System.out.println(str.toLowerCase());

        System.out.println();
    }

    //contains demo - checks if the strings contains the another strings
    //return type is boolean 
    //used in searching, check domain name validation
    //syntax: str.contains("text")
    public static void demoOfContains()
    {
        String sen = "Java Python Cpp";
        System.out.println(sen.contains("Java"));

        System.out.println();
    }


    /* trims: removes leading spaces and trailing spaces
    dosn't returns the space between the words
    return type: string
    used: user ip, database value, reading file */

    public static void demoTrim()
    {
        String name = "  I like java ";
        System.out.println(name.trim());

        System.out.println();
    }

    /* split: breaks the string into pieces (seperators id removed)
    return type: string
    used: csv files, sentences, names, tokenization */
    public static void demoSplit()
    {
        String name = "  I like java ";
        String[] words = name.split(" ");

        for(String word : words) //result is array so we need loop to print
        {
            System.out.println(word); 
        }
        System.out.println();
    }

    /* Substrings(begin index): returns characters from begin index till end  */
    public static void demoSubString()
    {
        String word = "Programming";
        System.out.println(word.substring(3));
        System.out.println();
    }

    //substringBegin End 
    public static void demoSubStringBeginEng()
    {
        String word = "Programming";
        System.out.println(word.substring(3, 7));
        System.out.println();
    }

    /* IndexOf() -- returns first occurance if found, if not then returns -1 
    used in -- searching, parsing, validation,  */
    public static void demoIndexOf()
    {
        String word = "shreyasumsd@gmail.com";
        System.out.println(word.indexOf('.'));
        System.out.println();
    }

    /* other index of methods -- homework===================================
    last index of all
    starts with, ends with,
     */

    /* valueOf() -- converts premitive data into strings 
    overloaded methods 
    int, double, float, long, boolean, char etc 
    used in: concatination, display,file writting*/
    public static void demoValueOf()
    {
        int num = 100;
        String str = String.valueOf(num);
        System.out.println(str);

        System.out.println();
    }

//=================================================================================
    //matches() 
    // regular expressions
    // dot . -- letters, spl char, everything except new line matches only single characters except new line

    public static void demoMatches() //regex
    {
        String str = "a";
        System.out.println(str.matches("."));
        System.out.println(str.matches("[abc]"));
        System.out.println(str.matches("[abc][vz]"));
        System.out.println(str.matches("[^abc]"));
        System.out.println(str.matches("[a-z1-7]"));
        System.out.println(str.matches("A|B"));
        System.out.println(str.matches("XZ"));
        System.out.println();
    }

    public static void typeDates()
    {
        String date = "31/03/2004 ";
        System.out.println("exam");
        System.out.println(date.matches("(0[1-9]|[12][0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})$"));

        
    }

    /* public static void extractMailId()
    {
        String mail = "shreyasumsd@gmail.com";
        System.out.println(mail.substring(12));

    } */

    public static void main(String[] args) 
    {
        demoToCharArray();    
        demoEquals();
        demoEqualsIgnoreCase();
        demoCompareTo();
        demoCompareToIgnoreCase();
        convertToLowerCase();
        demoOfContains();
        demoTrim();
        demoSplit();
        demoSubString();
        demoSubStringBeginEng();
        demoIndexOf();
        demoValueOf();

        demoMatches();
        typeDates();

    }    
}
