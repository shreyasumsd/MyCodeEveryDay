package IntegerArrayPQs;

public class Q2AverageMarks
{
    public static double calculateAverage(int[] marks)
    {
        int sum = 0;

        for (int i = 0; i < marks.length; i++)
        {
            sum = sum + marks[i];
        }
        double average = (double) sum / marks.length;
        return average;
    }
    public static void main(String[] args)
    {
        int[] marks = {70, 85, 90, 55};
        double result = calculateAverage(marks);
        System.out.println(result);
    }
}