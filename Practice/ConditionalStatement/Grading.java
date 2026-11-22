package Practice.ConditionalStatement;
import java.util.Scanner;

public class Grading 
{
    public void assignGrades(int marks)
    {
        if (marks >= 90)
            System.out.println("A");

        else if (marks >= 80)
            System.out.println("B");
        
        else if (marks >= 70)
            System.out.println("C");
        
        else if (marks >= 60)
            System.out.println("D");
        
        else if (marks >= 35)
            System.out.println("E");
        
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        Grading obj = new Grading();
        obj.assignGrades(marks);

        sc.close();
    }    
}