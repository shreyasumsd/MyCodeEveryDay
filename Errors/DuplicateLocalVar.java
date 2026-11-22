//Day-8 (01-oct-2026)

package Errors;

public class DuplicateLocalVar 
{
    public static void main(String[] args) 
    {
        int age = 25; // int age = 30; eror - dupilcate local var 
        int ages = 30; // change var name

        System.out.println(age);
        System.out.println(ages);

        //Fix 2
        int age1 = 20;
        age1 = 25;

        System.out.println(age1);


    }
    
}
