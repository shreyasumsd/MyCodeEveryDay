package DSA.Strings.InBuiltMethods;

public class MetaCharQuantifiers 
{
    // 1. \d -- matches the one digit
    public static void checkDigit()
    {
        System.out.println("\\d -- matches the one digit");
        String str = "8";
        System.out.println(str.matches("\\d")); // with a variable
        System.out.println("A".matches("\\d")); //directly

        System.out.println();
    }

    //2) \w -- matches one word character
    // equal to -- a-z 0-9 A-Z and underscore
    public static void checkWord()
    {
        System.out.println("\\w -- matches one word character");
        System.out.println("A".matches("\\w")); //directly //true
        System.out.println("9".matches("\\w")); //true
        System.out.println("@".matches("\\w")); //false
        System.out.println("_".matches("\\w")); //true
        System.out.println(" ".matches("\\w")); //false

        System.out.println();
    }

    //3) \D -- matches anything except digits
     public static void checkAnything()
    {
        System.out.println("\\D -- matches anything except digits");
        System.out.println("A".matches("\\D")); 
        System.out.println("9".matches("\\D")); 
        System.out.println("@".matches("\\D")); 
        System.out.println("_".matches("\\D")); 
        System.out.println(" ".matches("\\D")); 

        System.out.println();
    }

    //4) \s -- matches one white space
     public static void checkWhiteSpace()
    {
        System.out.println("\\s -- matches one white space");
        System.out.println("A".matches("\\s")); 
        System.out.println("9".matches("\\s")); 
        System.out.println("@".matches("\\s")); 
        System.out.println("_".matches("\\s")); 
        System.out.println(" ".matches("\\s")); 

        System.out.println();
    }

    //5) \S -- matches any non white space
     public static void checkNonWhiteSpace()
    {
        System.out.println("\\S -- matches any non white space");
        System.out.println("A".matches("\\S")); 
        System.out.println("9".matches("\\S")); 
        System.out.println("@".matches("\\S")); 
        System.out.println("_".matches("\\S")); 
        System.out.println(" ".matches("\\S")); 

        System.out.println();
    }

    //6) \W -- matches non word
    public static void checkNonWord()
    {
        System.out.println("\\W -- matches non word");
        System.out.println("A".matches("\\W")); 
        System.out.println("9".matches("\\W")); 
        System.out.println("@".matches("\\W")); 
        System.out.println("_".matches("\\W")); 
        System.out.println(" ".matches("\\W")); 

        System.out.println();
    }

    //7) \. -- matches any character
    public static void checkAnyCharacter()
    {
        System.out.println("\\. -- matches any character");
        System.out.println("A".matches("\\.")); 
        System.out.println("9".matches("\\.")); 
        System.out.println("@".matches("\\.")); 
        System.out.println("_".matches("\\.")); 
        System.out.println(" ".matches("\\.")); 

        System.out.println();
    }

    //Quantifiers
    //1) star operators
    public static void starQuant()
    {
        System.out.println("star operators");

        String str1 = "a";
        String str2 = "";
        String str3 = "aaabbb";

        System.out.println(str1.matches("[abc]*"));
        System.out.println(str2.matches("[abc]*"));
        System.out.println(str3.matches("[abc]*"));

        System.out.println();
    }
    
    //2) plus operators
    public static void plusQuant()
    {
        System.out.println("plus operators");
        String str1 = "a";
        String str2 = "";
        String str3 = "aaabbb";

        System.out.println(str1.matches("[abc]+"));
        System.out.println(str2.matches("[abc]+"));
        System.out.println(str3.matches("[abc]+"));

        System.out.println();
    }

    //3) exact count
    public static void exactCountQuant()
    {
        System.out.println("exact count");
        String str1 = "abc";
        String str2 = "ab";
        String str3 = "abcd";

        System.out.println(str1.matches("[abc]{3}"));
        System.out.println(str2.matches("[abc]{3}"));
        System.out.println(str3.matches("[abc]{3}"));

        System.out.println();
    }

    //4) {min,max}
    public static void minMaxQuant()
    {
        System.out.println("min max quant");
        String str1 = "abccba";
        String str2 = "ab";
        String str3 = "abccbaaa";

        System.out.println(str1.matches("[abc]{3,7}"));
        System.out.println(str2.matches("[abc]{3,7}"));
        System.out.println(str3.matches("[abc]{3,7}"));

        System.out.println();
    }

    //5) ? -- no char or single char
    public static void questionMarkQuant()
    {
        System.out.println("Question Mark quant");
        String str1 = "ac";
        String str2 = "abc";
        String str3 = "abbc";

        System.out.println(str1.matches("[ab?c]"));
        System.out.println(str2.matches("[ab?c]"));
        System.out.println(str3.matches("[ab?c]"));

        System.out.println();
    }

    public static void main(String[] args) 
    {
        checkDigit();
        checkWord();
        checkAnything();
        checkWhiteSpace();
        checkNonWhiteSpace();
        checkNonWord();
        checkAnyCharacter();

        starQuant();
        plusQuant();
        exactCountQuant();
        minMaxQuant();
        questionMarkQuant();
    }    
}
