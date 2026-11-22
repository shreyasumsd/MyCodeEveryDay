package DSA.TwoDArrays;

public class TwoDArrayL2 
{
    //Sum of Element
    public static int getSumOfMatrix(int[][] arr)
    {
        int sum = 0;

        for (int i =0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    //Find max in the matrix
    public static int getMax(int[][] arr)
    {
        int max = arr[0][0]; //integer.min_value
        for (int i =0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                if(arr[i][j]>max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    //Find min in the matrix
    public static int getMin(int[][] arr)
    {
        int min = arr[0][0];
        for (int i =0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                if(arr[i][j]<min)
                {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    //Return EvenOdd Count
    public static int[] getEvenOddCount(int[][] arr)
    {
        int even = 0;
        int odd = 0;

        for (int i =0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                if(arr[i][j]%2 == 0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
        }
        return new int[] {even , odd};
    }
    
    //Search the element in matrix
    public static boolean findElement(int[][] arr, int key)
    {
        for (int i =0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                if(arr[i][j] == key)
                {
                    System.out.println("Element found at row: " + i  + " " + "Column: " + j);
                    return true;
                }
            }
        }
        System.out.println();
        return false;
    }

    //Sum of Main diagonal
    public static int getSumOfMainDiagonal(int[][] arr)
    {
        int sum = 0;
        for (int i =0; i< arr.length; i++)
        {
            sum += arr[i][i];
        }
        return sum;
    }

    //Sum of Secondary diagonal
    public static int getSumOfSecondaryDiagonal(int[][] arr)
    {
        int sum = 0;
        for (int i =0; i< arr.length; i++)
        {
            sum += arr[i][arr.length - 1 - i];
        }
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int arr[][] ={{3,5,9},{7,6,2},{4,8,1}};

        System.out.println("Sum of all element: " + getSumOfMatrix(arr));
        System.out.println();

        System.out.println("Max  element: " + getMax(arr));
        System.out.println();

        System.out.println("Min  element: " + getMin(arr));
        System.out.println();

        int[] result = getEvenOddCount(arr);
        System.out.println("even count: " + result[0]+ " " + "Odd count: " + result[1]);
        System.out.println();

        boolean found = findElement(arr, 8);
        System.out.println("element found: " + found);
        System.out.println();

        int diagonalSum = getSumOfMainDiagonal(arr);
        System.out.println("Sum of Main diagonal: " + diagonalSum);
        System.out.println();

        int secondaryDiagonalSum = getSumOfSecondaryDiagonal(arr);
        System.out.println("Sum of Secondary diagonal: " + secondaryDiagonalSum);
        System.out.println();
    }
}
