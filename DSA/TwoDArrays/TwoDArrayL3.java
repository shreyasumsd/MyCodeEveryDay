package DSA.TwoDArrays;

public class TwoDArrayL3 
{
    public static void getElementsSwapped(int [][] arr)
    {
        System.out.println("Swapped elements: ");
        for (int i =0; i< arr.length; i++)
        {
            int temp = arr[i][0];
            arr[i][0] = arr[i][2];
            arr[i][2] =temp;
        }

        for (int i =0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }    
    }

    public static void printBoundaryElements(int[][] arr)
    {
        System.out.println("Boundary Elements: ");
        for (int i =0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[0].length; j++)
            {
                if (i == 0 || i == arr.length - 1 ||
                    j == 0 || j == arr[0].length - 1)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printCornerElements(int[][] arr)
    {
        System.out.println("Corner Elements: ");
        for (int i =0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[0].length; j++)
            {
                if (i == 0 && j == 0 ||
                    i == arr.length - 1 && j == arr[i].length - 1 ||
                    i == 0 && j == arr[i].length - 1 ||
                    j == 0 && i == arr.length - 1)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printTranspose(int[][] arr)
    {
        int newMatrix[][] = new int[arr[0].length][arr.length];
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                newMatrix[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i< newMatrix.length; i++)
        {
            for(int j = 0; j<newMatrix[i].length; j++)
            {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getMatrixMultiplication(int[][] arr, int[][] arr1)
    {
        System.out.println("Matrix Multiplication: ");
        int[][] result = new int[arr.length][arr1[0].length];

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr1[0].length; j++) 
            {
                for (int k = 0; k < arr1.length; k++) 
                {
                    result[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
        
        for (int i = 0; i < result.length; i++) 
        {
            for (int j = 0; j < result[0].length; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
       int arr[][] = {{3,5,9},{7,6,2},{4,8,1}};
       int arr1[][] = {{1,0,0},{0,1,0},{0,0,1}};  

      /* getElementsSwapped(arr);
      System.out.println(); */

       printBoundaryElements(arr);
       System.out.println();

       printCornerElements(arr);
       System.out.println();

       printTranspose(arr);
       System.out.println();

       getMatrixMultiplication(arr, arr1);
       System.out.println();
    }    
}