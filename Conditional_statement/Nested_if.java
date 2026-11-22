package Conditional_statement;

public class Nested_if 
{
    public static void main(String[] args) 
    {
        int age = 12;
        int height = 170;
        boolean medicalFit = true;
        boolean physicalPassed = true;

        if (age >= 18)
        {
            if(height >= 170)
            {
                if(medicalFit)
                {
                    if(physicalPassed)
                    {
                        System.out.println("Selected");
                    }
                }
            }
        }
        else{
            System.out.println("Not selected");
        }

    }
    
}
