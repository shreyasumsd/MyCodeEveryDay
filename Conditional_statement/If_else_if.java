package Conditional_statement;

public class If_else_if 
{
    public static void main(String[] args) 
    {
        int marks = 50;

        if(marks >= 90)
        {
            System.out.println("Officer");
        }
        else if(marks >= 80)
        {
            System.out.println("technical team");
        }
        else if (marks >= 70)
        {
            System.out.println("GD");
        }
        else if (marks >= 60)
        {
            System.out.println("clerk");
        }
        else
        {
            System.out.println("Not qualified");
        }
        
    }
    
}
