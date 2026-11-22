package Conditional_statement;

public class ContBreak 
{
    public static void main(String[] args) {
        System.out.println("====Break====");

        for(int i = 1; i <= 10; i++)
        {
            if(i == 6)   
            {
                break;
            }    
            System.out.println(i);
            
        }

        System.out.println("Loop Terminated");
        System.out.println();

        System.out.println("====Continue====");

        for(int j = 1; j <= 10; j++)
        {
            if(j == 6 )
            {
                continue; //Skip
            }
            System.out.println(j);

        }


    }

    
}
