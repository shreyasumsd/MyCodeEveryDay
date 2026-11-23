package CharacterArrayPQs;

public class Q7PasswordCheck 
{
    public static boolean checkPassword(char[] arr)
    {
        if(arr.length < 8)
        {
            return false;
        }

        for(int i = 0; i<arr.length; i++)
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
        char[] arr = {'s','e','c','r','e','t','9','x'};

        boolean result = checkPassword(arr);
        System.out.println(result);


    }    
}
