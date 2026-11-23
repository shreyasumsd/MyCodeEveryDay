package CharacterArrayPQs;

public class Q4FindDigits 
{
    public static boolean findDigitsInArray(char[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= '0' && arr[i] <= '9')
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) 
    {
        char[] arr = {'a','1','c','r'}; 

        boolean result = findDigitsInArray(arr);
        System.out.println(result);
    }    
}
