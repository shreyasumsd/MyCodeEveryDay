package Loops;

public class for_each 
{
    public static void main(String[] args) 
    {
        int[] number = {50,40,30,20,10};

        for(int pickNumber : number)
        {
            System.out.println(pickNumber);
        }
    }
}