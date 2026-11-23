package CharacterArrayPQs;

public class Q5FirstLastCharNewArray 
{
    public static char[] firstLastChar(char[] arr)
    {
        char[] newArray = {arr[0], arr[arr.length -1]};
        return newArray;
    }
    
    public static void main(String[] args) 
    {
        char[] arr = {'m','a','n','g','o'};
        char[] result = firstLastChar(arr);
        System.out.println(result);
    }    
}
