package DSA.Strings;

public class StringsLeet 
{
    // leet code -- 125
    // Approach 1 : reverse string
    // class used : String Builder
    // reason : less object and there is direct method to reverse in string builder
    // Time complexity: O(n)
    // Space complexity: O(n)
    public static void testPalindrome(String input)
    {
        boolean answer = isPalindrome(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + answer);
        System.out.println();
    } 

    public static boolean isPalindrome(String input)
    {
        //step 1 -- convert anything to lower case
        input = input.toLowerCase();

        //Step 2 -- keep only letters and digits 
        //ignore spaces , . : etc..
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < input.length(); i++)
        {
            char current = input.charAt(i);
            if (Character.isLetterOrDigit(current))
            {
                cleaned.append(current);
            }
        }

        //reverse
        StringBuilder builder = new StringBuilder(cleaned);
        String reversed = builder.reverse().toString();

        //return
        return cleaned.equals(reversed);
    }

    // leet code -- 125
    // Approach 2 : building clean string using string builder
    // whats new : avoid creating multiple string object while cleaning
    // class used : String Builder
    // reason : less object and there is direct method to reverse in string builder
    // Time complexity: O(n)
    // Space complexity: O(n)
    public static void testPalindrome1(String input)
    {
        System.out.println("========== Approach 2 ==============");
        boolean answer = isPalindrome1(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + answer);
        System.out.println();
    }

    public static boolean isPalindrome1(String input)
    {
        // step 1 : to lower case
        input = input.toLowerCase();

        StringBuilder cleaned = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++)
        {
            char current = input.charAt(i);
            if (Character.isLetterOrDigit(current))
            {
                cleaned.append(current);
            }
        }

        // reverse
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.toString().equals(reversed);
    }

    // leet code -- 125
    // Approach 3 : use string and two pointers
    // whats new : two pointers because only traversal is required
    // reason : less object and there is direct method to reverse in string builder
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static void testPalindrome2(String input)
    {
        System.out.println("========== 3 ==============");
        boolean answer = isPalindrome1(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + answer);
        System.out.println();
    }

    public static boolean isPalindrome2(String input)
    {
        // step 1 : to lower case
        input = input.toLowerCase();

        int left = 0;
        int right = input.length() -1;

        while(left < right)
        {
            //ignore special character from left
            while(left < right && !Character.isLetterOrDigit(input.charAt(left)))
            {
                left++;
            }

            //from right
            while(left < right && !Character.isLetterOrDigit(input.charAt(right)))
            {
                right--;
            }

            //compare character
            if(input.charAt(left)!= input.charAt(right))
            {
                return false; 
            }

            //move both
            left++;
            right--;
        }
        return true;
        
    }

    public static void main(String[] args) 
    {
        testPalindrome("Madam");
        testPalindrome("madam");
        testPalindrome("12321");
        testPalindrome("hello");
        testPalindrome("A man, a plan, a cannal : Panama");
        testPalindrome("race a car");
        testPalindrome("A1@1a");
        
        testPalindrome1("Madam");
        testPalindrome1("madam");
        testPalindrome1("12321");
        testPalindrome1("hello");
        testPalindrome1("A man, a plan, a cannal : Panama");
        testPalindrome1("race a car");
        testPalindrome1("A1@1a");

        testPalindrome2("Madam");
        testPalindrome2("madam");
        testPalindrome2("12321");
        testPalindrome2("hello");
        testPalindrome2("A man, a plan, a cannal : Panama");
        testPalindrome2("race a car");
        testPalindrome2("A1@1a");
    }    
}
