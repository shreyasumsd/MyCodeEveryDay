package DSA.Strings;

public class StringProblems 
{
    //Count vowels in char array

    public static void countVowels(char arr[])
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
               arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')
            {
                count++;
            }
        }
        System.out.println("Number of Vowels: " + count);

        System.out.println();
    }

    //Count vowels in String

    public static void countVowelsInString(String st)
    {
        int count = 0;

        for(int i = 0; i < st.length(); i++)
        {
            if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u' ||
               st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O' || st.charAt(i) == 'U')
            {
                count++;
            }
        }
        System.out.println("Number of Vowels: " + count);

        System.out.println();
    }

    //Count upper case letters in char array

    public static void countUpperCase(char arr[])
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 'A' && arr[i] <= 'Z')
            {
                count++;
            }
        }
        System.out.println("Number of Upper Case Letters: " + count);

        System.out.println();
    }

    //Count upper case letters in String

    public static void countUpperCaseInString(String st)
    {
        int count = 0;

        for(int i = 0; i < st.length(); i++)
        {
            if(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z')
            {
                count++;
            }
        }
        System.out.println("Number of Upper Case Letters: " + count);

        System.out.println();
    }

    //Count digits in char array

    public static void countDigits(char arr[])
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= '0' && arr[i] <= '9')
            {
                count++;
            }
        }
        System.out.println("Number of Digits: " + count);

        System.out.println();
    }

    //Count digits in String

    public static void countDigitsInString(String st)
    {
        int count = 0;

        for(int i = 0; i < st.length(); i++)
        {
            if(st.charAt(i) >= '0' && st.charAt(i) <= '9')
            {
                count++;
            }
        }
        System.out.println("Number of Digits: " + count);

        System.out.println();
    }

    //Count special characters in char array

    public static void countSpecialCharacters(char arr[])
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(!((arr[i] >= 'A' && arr[i] <= 'Z') ||
                 (arr[i] >= 'a' && arr[i] <= 'z') ||
                 (arr[i] >= '0' && arr[i] <= '9')))
            {
                count++;
            }
        }
        System.out.println("Number of Special Characters: " + count);

        System.out.println();
    }

    //Count special characters in String

    public static void countSpecialCharactersInString(String st)
    {
        int count = 0;

        for(int i = 0; i < st.length(); i++)
        {
            if(!((st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') ||
                 (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') ||
                 (st.charAt(i) >= '0' && st.charAt(i) <= '9')))
            {
                count++;
            }
        }
        System.out.println("Number of Special Characters: " + count);

        System.out.println();
    }

    //Search for 'o' in char array

    public static void searchO(char arr[])
    {
        boolean flag = false;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'o')
            {
                flag = true;
                break;
            }
        }

        if(flag)
        {
            System.out.println("'o' is present");
        }
        else
        {
            System.out.println("'o' is not present");
        }

        System.out.println();
    }

    //Search for 'o' in String

    public static void searchOInString(String st)
    {
        boolean flag = false;

        for(int i = 0; i < st.length(); i++)
        {
            if(st.charAt(i) == 'o')
            {
                flag = true;
                break;
            }
        }

        if(flag)
        {
            System.out.println("'o' is present");
        }
        else
        {
            System.out.println("'o' is not present");
        }

        System.out.println();
    }

    //Count occurrences of a character

    public static void countOccurrence(char arr[])
    {
        int count = 0;
        char key = 'o';

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                count++;
            }
        }
        System.out.println(key + " occurrence is: " + count);

        System.out.println();
    }

    //Find the largest character

    public static void findLargestChar(char arr[])
    {
        char largest = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest Character: " + largest);

        System.out.println();
    }

    //reverse char array
    public static void revCharArray()
    {
        char[] name = {'J','a','v','a'};

        int left = 0; 
        int right = name.length-1;

        while(left < right)
        {
            char temp = name[left];
            name[left] = name[right];
            name[right] = temp;

            left ++;
            right --;
        }
        System.out.println("After swap: ");

        for(char ch : name)
        {
            System.out.print(ch);
        }
        System.out.println();
    }

    //rev string

    public static void revString() 
    {
    String name = "Java";
    StringBuilder answer = new StringBuilder();

    for (int i = name.length() - 1; i >= 0; i--) 
    {
        answer.append(name.charAt(i));
    }

    System.out.println("After: " + answer);
    }

    //length of last word ************************************************************

    public static int lengthOfLastWord() 
    {
        String sentence = "Hello world";

        int count = 0;
        int i = sentence.length() - 1;

        //ignore trailing space

        while(i>=0 && sentence.charAt(i) == ' ')
        {
            i--;

        } 

        while(i>=0 && sentence.charAt(i) != ' ')
        {
            count ++;
            i--;
        }

        return count;
    }
    // leet 557*********************************************************************
    public static void revWords()
    {
        char[] sentence = {'H', 'A', 'R', 'S', 'H', 'A'};
        int start = 0;
        for (int end = 0; end < sentence.length; end ++)
        {
            if(end == sentence.length || sentence [end] == ' ')
            {
                int left = start;
                int right = end  -1;

                while (left < right)
                {
                    char temp = sentence [left];
                    sentence[left] = sentence[right];
                    sentence[right] =temp;

                    left ++;
                    right--;

                }
                start = end +1 ;

            }
            System.out.println(sentence);
        }
    }

    // leet 2114***************************************************************

    public static void maxWords()
    {
        String[] sentences = {"I love Peda", "Peda is very sweet", "Peda is very good"};

        int maxWords = 0;

        for(int i = 0; i< sentences.length; i++)
        {
            int word = 1;
            for(int j = 0; j<sentences[i].length(); j++)
            {
                if(sentences[i].charAt(j) == ' ')
                {
                    word ++;
                }
            }

            if(word > maxWords)
            {
                maxWords = word;
            }
        }
        System.out.println("MAX words: " + maxWords);
    }

    public static void main(String[] args) 
    {
        char arr[] = {'H', 'A', 'R', 'S', 'H', 'A'};
        countVowels(arr);

        String st = "HARSHA";
        countVowelsInString(st);

        countUpperCase(arr);
        countUpperCaseInString(st);

        char arr2[] = {'H', '1', 'R', '0', 'H', '4'};
        countDigits(arr2);

        String st2 = "H1A5";
        countDigitsInString(st2);

        char arr3[] = {'H', '@', 'R', '@', 'H', '4'};
        countSpecialCharacters(arr3);

        String st3 = "H@r@$s";
        countSpecialCharactersInString(st3);

        char arr4[] = {'H', 'o', 'R', '@', 'H', '4'};
        searchO(arr4);

        String st4 = "Hor@$s";
        searchOInString(st4);

        countOccurrence(arr4);

        findLargestChar(arr4);

        revCharArray();

        revString();
        revWords();
        lengthOfLastWord();
        maxWords();
        
    }
}