package CharacterArrayPQs;

public class Q8ReplaceToUnderScore 
{
    public static char[] replaceSpace(char[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == ' ')
            {
                arr[i] = '_';
            }
        }
        return arr;
    }
    
    public static void main(String[] args) 
    {
        char[] arr = {'h','i',' ','t','h','e','r','e'};
        char[] result = replaceSpace(arr);
        System.out.println(result);
    }    
}
