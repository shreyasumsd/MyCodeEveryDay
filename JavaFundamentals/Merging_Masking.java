package JavaFundamentals;
public class Merging_Masking 
{
    public static void main(String[] args) 
    {
        // Merging
        System.out.println("Merging");

        int first = 5; //0000 0101
        int second = 10; //0000 1010

        int result = (first << 4 | second);

        System.out.println(result);

        System.out.println();

        //Masking
        System.out.println("Masking");

        int number = 90;
        int result1 = number & 15; //00001111

        System.out.println(result1);

        
    }
    
}
