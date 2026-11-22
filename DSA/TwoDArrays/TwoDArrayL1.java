package DSA.TwoDArrays;

public class TwoDArrayL1 
{
    //1 Print Matrix
    public static void printMatrix(int[][]arr)
    {
        
        System.out.println("Matrix");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 2 Print address of Matrix
    public static void printAddress(int[][]arr)
    {
        System.out.println("Address: " + arr);
        System.out.println();
    }

    //3 Print Row Address
    public static void printRowAddress(int [][] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println("Row " + i + " Address " + arr[i]);
        }
        System.out.println();
    }

    //Print Row count
    public static void printRowCount(int [][] arr)
    {
        System.out.println("Row count is: " + arr.length);
        System.out.println();
    }

    //Print column count 
    public static void printColumnCount(int [][] arr)
    {
        System.out.println("Column count is: " + arr[0].length);
        System.out.println();
    }

    //Print First Row
    public static void printFirstRow(int [][] arr)
    {
        System.out.print("First Row: " );
        for(int j =0; j < arr[0].length; j++)
        {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();
    }

    //Print First Column
    public static void printFirstColumn(int[][] arr)
    {
        System.out.print("First Column: ");
        System.out.println();
        for(int i = 0; i < arr.length; i ++)
        {
            System.out.println(arr[i][0] + " ");
        }
        System.out.println();
    }

    //Print Last Row
    public static void printLastRow(int [][] arr)
    {
        int i = arr.length-1;

        System.out.print("Last Row: " );
        for (int j = 0; j < arr[i].length; j++)
        {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
    //Print Last Column
    public static void printLastColumn(int [][] arr)
    {
        int j = arr[0].length-1; //3-1=2

        System.out.print("Last Column: " );
        System.out.println();
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i][j] + " ");
        }
        System.out.println();
    }

    // Print Main Diagonal
    public static void printMainDiagonal(int[][] arr)
    { 
       System.out.print("Main Diagonal: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    }

    // Print Secondary Diagonal
    public static void printSecondaryDiagonal(int[][] arr)
    {
        System.out.print("Secondary Diagonal: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i][arr.length - 1 - i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int arr[][] ={{3,5,9},{7,6,2},{4,8,1}};
        
        printMatrix(arr);

        printAddress(arr);

        printRowAddress(arr);

        printRowCount(arr);

        printColumnCount(arr);

        printFirstRow(arr);

        printFirstColumn(arr);

        printLastRow(arr);

        printLastColumn(arr);

        printMainDiagonal(arr);

        printSecondaryDiagonal(arr);
    }    
}
