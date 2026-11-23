package CharacterArrayPQs;

public class Q6FindCaps 
{
    public static int findCapitalLetters(char[] arr)
    {
        int capsCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 'A' && arr[i] <= 'Z')
            {
                capsCount++;
            }
        }
        return capsCount;
    }
    
    public static void main(String[] args) 
    {
        char[] arr = {'I','n','D','i','a','N','o','1'};
        int result = findCapitalLetters(arr);
        System.out.println(result);
    }    
}
