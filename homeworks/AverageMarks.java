public class AverageMarks 
{
    public static void main(String[] args) 
    {
        int s1 = 100;
        int s2 = 99;
        int s3 = 98;
        int s4 = 97;
        int s5 = 96;
        int s6 = 95;

        int total = s1 + s2 +s3+s4+s5+s6;

        System.out.println("Total marks: " + total);

        double average = (total) / 6.0 ;

        System.out.println("Percentage: " + average + "%");
    }
    
}