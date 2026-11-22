package CharacterArrayPQs;

public class Q3ConvertToCaps 
{
    public static char[] convertToUppercase(char[] arr)
    {
        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            result[i] = Character.toUpperCase(arr[i]);
        }

        return result;
    }

    public static void main(String[] args)
    {
        char[] arr = {'c', 'o', 'd', 'e'};

        char[] output = convertToUppercase(arr);

        System.out.println(java.util.Arrays.toString(output));
    }
}