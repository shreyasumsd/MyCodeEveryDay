package DSA.Strings;

public class DecodeCompressString 
{
    //decoded compressing string
    //input: a3b3c3
    //output: aaabbbccc
    //use : string builder + parsing
    //TC:
    //Sc:
    public static void testDecode(String input)
    {
        System.out.println("Input: " + input);
        System.out.println("Output: " + decode(input));
        System.out.println();
    }

    public static String decode(String input)
    {
        StringBuilder answer = new StringBuilder(); //16 space allocated
        
        for(int i = 0; i < input.length(); i ++)
        {
            //read character
            char currentCharacter = input.charAt(i);

            //read digit
            int number = input.charAt(i+1) - '0';
            //parsing -- conv one format to another

            //append
            for(int count = 1; count <= number; count++)
            {
                answer.append(currentCharacter);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) 
    {
        testDecode("a3b3c3");
        testDecode("x1y5");
        testDecode("m2n3");
        testDecode("a12b123");
    }    
}
