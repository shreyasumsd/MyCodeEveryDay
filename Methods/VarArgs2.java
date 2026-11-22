package Methods;
//passing diff data types separately using var args 
public class VarArgs2 
{
    static void student(String name, int age, int...marks)
    {
        System.out.println(name);
        System.out.println(age);
        
        for (int m : marks) // marks are storing inside m
        {
            System.out.print(m + " ");
        }
    }

    public static void main(String[] args) 
    {
        student("Rohith", 21, 70, 80, 90);
        student("Amit", 21,98,78);
    }
    
}
