package CharacterArrayPQs;

public class Q12LastChar
{
    public static char findLargestCharacter(char[] arr)
{
    char largest = arr[0];

    for(int i = 1; i < arr.length; i++)
    {
        if(arr[i] > largest)
        {
            largest = arr[i];
        }
    }

    return largest;
}

public static void main(String[] args)
{
    char[] arr = {'d', 'o', 'g', 's'};

    System.out.println(findLargestCharacter(arr));
}
}