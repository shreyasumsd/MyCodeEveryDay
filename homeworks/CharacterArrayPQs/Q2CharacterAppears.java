package CharacterArrayPQs;

public class Q2CharacterAppears 
{
    public static int countChar(char[] arr)
    {
        int count = 0;
        
        char word = 'a';
        for(int i = 0; i <arr.length; i++)
        {
            if (arr[i] == word)
            {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) 
    {
        char[] arr = {'b','a','n','a','n','a'};

        int result = countChar(arr);
        System.out.println(result);

    }    
}
