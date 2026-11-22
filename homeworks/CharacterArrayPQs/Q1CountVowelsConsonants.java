package CharacterArrayPQs;

public class Q1CountVowelsConsonants 
{
    public static int[] countVowelsAndConsonants(char[] arr)
    {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 'a' ||
                arr[i] == 'e' || 
                arr[i] == 'i' || 
                arr[i] == 'o' || 
                arr[i] == 'u')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }

        return new int[] {vowels, consonants};
    }

    public static void main(String[] args)
    {
        char[] arr = {'a', 'p', 'p', 'l', 'e'};

        int[] result = countVowelsAndConsonants(arr);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}