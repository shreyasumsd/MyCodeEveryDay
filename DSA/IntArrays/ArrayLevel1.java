package DSA.IntArrays;

public class ArrayLevel1 
{
    //Method - 1: Print all elements --> Traversing array
    public void printElements(int[]arr)
    {
        System.out.println("Method - 1: Print all elements --> Traversing array");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    // Method - 2: Print first middle and last --index based access
    public void  printFirstMidLast(int[]arr)
    {
        System.out.println("Method - 2: Print first middle and last --index based access");

        System.out.println("First: " + arr[0] + " ");
        System.out.println("Mid: " + arr[arr.length /2] + " ");
        System.out.println("Last: " + arr[arr.length - 1] + " ");

        System.out.println(" ");
    }
    
    //Method - 3: How to print length of an array?
    void printLength(int[]arr)
    {
        System.out.println("Method - 3: How to print length of an array?");

        System.out.println("Length of array: " + arr.length);
        System.out.println(arr);

        System.out.println(" ");
    }

    //Method - 4: Modify third element -- update array
    void modifyArray(int[]arr)
    {
        System.out.println("Method - 4: Modify third element -- update array");

        arr[2] = 100;
        System.out.println("After Modification: ");
        for(int i= 0; i < arr.length; i++ )
        {
            System.out.println(arr[i]);
        }
         System.out.println(" ");
    }

    //Method - 5: Demo of reference copy
    void referenceCopy(int[]arr)
    {
        System.out.println("Method - 5: Demo of reference copy");

        int[] copy = arr ;
        System.out.println("Before");

        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

         System.out.println(" ");

        copy[0] = 100;
        System.out.println("after");
        
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
         System.out.println(" ");
    }

    //Method - 6: Diff type of arrays
    void diffTypesArray(int[] numbers, 
                        double[] salaries, 
                        char[] grades, 
                        boolean[] status, 
                        String[] names)
    {
        System.out.println("Method - 6: Diff type of arrays");

        System.out.println("Integer array");
        {
            for(int i = 0; i < numbers.length; i++)
            {
                System.out.println("Int: " + numbers[i]);
            }

            System.out.println();

            // HOME WORK - Print rest of them above

            for(int i = 0; i < salaries.length; i++)
            {
                System.out.println("Double: " + salaries[i]);
            }

            System.out.println();

            for(int i = 0; i < grades.length; i++)
            {
                System.out.println("Char: " + grades[i]);
            }

            System.out.println();

            for(int i = 0; i < status.length; i++)
            {
                System.out.println("Boolean: " + status[i]);
            }

            System.out.println();

            for(int i = 0; i < names.length; i++)
            {
                System.out.println("Strings: " + names[i]);
            }
        }
        System.out.println("");
    }

    //Method - 7: Empty Array
    void emptyArray(int[]a)
    {
        System.out.println("Method - 7: Empty Array");

        System.err.println("length: " + a.length);

        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    //Method - 8: Null array
    void nullArray(int[]b)
    {
        System.out.println("Method - 8: Null array");
        System.out.println(b);
    }



    public static void main(String[] args) 
    {
        ArrayLevel1 obj = new ArrayLevel1();
        int [] arr = {10, 20, 30, 40};
        
        //Method 1
        obj.printElements(arr);
        
        //Method 2
        obj.printFirstMidLast(arr);

        //Method 3
        obj.printLength(arr);

        //Method 4
        obj.modifyArray(arr);

        //Method 5 
        obj.referenceCopy(arr);

        //Method 6
        int[]numbers = {10,20,30,40};
        double[] salaries = {25000, 35000.75,};
        char[] grades = {'A', 'B', 'C'};
        boolean[] status ={true, false, true};
        String[] names = {"RAM", "MOHAN", "YASH"};
        obj.diffTypesArray(numbers, salaries, grades, status, names );

        //Method 7
        int [] a = {};
        obj.emptyArray(a);

        //Method 8
        int [] b = null;
        obj.nullArray(b);

    }
    
}
