// Day 9 - 02-OCT-2026

public class JVM_arch 
{
    public static void main(String[] args) 
    {
        int x = 15; // going to stack
        int y = 25; // in stack

        int z = x + y; // in stack

        String Str = new String ("sum" + z); //heap
        System.out.println(Str + z);

    }
    
}
