package Practice;

public class dsaForEach {

    public static void printArray() 
    {
        int[] arr = {10, 20, 30, 40, 50};

        for (int num : arr) 
        {
            System.out.println(num);
        }
    }

    public static void main(String[] args) 
    {
        printArray();
    }
}