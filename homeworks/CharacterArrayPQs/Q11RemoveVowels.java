package CharacterArrayPQs;

public class Q11RemoveVowels 
{
    public static char[] removeVowelsInArray(char[] arr)
    {
        int count = 0; 
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' &&
               arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U')
            {
                count++;
            }
        }

        char[] newArray = new char[count];

        int j = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' &&
               arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U')
            {   
                newArray[j] = arr[i];
                j++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) 
    {
        char [] arr = {'p','r','o','g','r','a','m'};
        
        char[] result = removeVowelsInArray(arr);
        System.out.println(result);
    }    
}
