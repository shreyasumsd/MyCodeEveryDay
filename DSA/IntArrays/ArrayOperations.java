package DSA.IntArrays;

public class ArrayOperations 
{
    //blueprint
    int[] array;
    int length;
    int rightIndex; //elements at end, this is size of the array = number of elements in an array

    public ArrayOperations()
    {
        //decoration
        length = 5;
        array= new int[length];
        rightIndex = 0;
    }

    //Insert at end 
    public void inserAtEnd(int value)
    {
        //arrays is full
        if(rightIndex == length)
        {
            System.out.println("Arrat is full");
            return;
        }
        else 
        {
            array[rightIndex] = value;
            rightIndex ++;
        }
    }

    //Insert at Start
    public void insertAtStart(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        else
        {
            //Shift elements
            for(int i = rightIndex - 1; i>=0; i--)
            {
                array[i+1] = array[i];
            }

            //insert
            array[0] = value;
            rightIndex++; //increase size as u hve inserted one extra element
        }
    }

    //Insert at any position
    public void InsertAtAnyPosition(int value, int position)
    {
        if (rightIndex == length)
        {
            System.out.println("Array is full");
            return ;
        }

        //edge case 2 
        if(position < 0 || position > rightIndex)
        {
                System.out.println("Invalid Position");
                return;
        }

        //shift and insert
        for(int i = rightIndex - 1; i >= position; i--)
        {
            array[i + 1] = array[i];
        }
        array[position] = value;
        rightIndex++;

        System.out.println();
    }

    //Deletion ========================================================
    public void deleteFromEnd()
    {
        if(rightIndex == 0)
        {
            System.out.println("Empty");
            return;
        }

        rightIndex --; 
        array[rightIndex] = 0;
    }

    //delete from start
    public void deleteFromStart()
    {
        if(rightIndex == 0)
        {
            System.out.println("Empty");
            return;
        }

        for(int i = 0; i<rightIndex - 1; i++)
        {
            array[i] =array[i+1];
        }
        rightIndex --;
        array[rightIndex] =0 ;
    }

    public void deleteFromAnyPosition(int position)
    {
        if(rightIndex == 0)
        {
            System.out.println("Empty");
            return;
        }

        if(position < 0 || position > rightIndex)
        {
            System.out.println("Invalid position");
            return;
        }

        for(int i = 0; i<rightIndex - 1; i++)
        {
            array[i] =array[i+1];
        }

        rightIndex --; 
        array[rightIndex] = 0;
    }

    public void printElements()
    {
        System.out.println("Index\tvalue");

        for(int i = 0; i < length; i++)
        {
            System.out.println(i + "\t" + array[i]);
        }
        System.out.println("Size: " + rightIndex);
        System.out.println();
    }
}