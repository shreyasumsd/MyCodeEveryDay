package DSA.Stack;

public class StackL1 
{
    int size;
    int top;
    int[] stack;
    
    StackL1(int size)
    {
        this.size = 5; //this --> keyword
        top = -1;
        stack = new int[size];
    }

    //isEmpty()
    boolean isEmpty()
    {
        return top == -1;
    }

    // isFull()
    boolean isFull()
    {
        return top == size - 1;
    }

    //push()
    void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            return;
        }

        top++;
        stack[top] = value;

        System.out.println(value + "Inserted into stack");
    }

    //pop()
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = stack[top];
        top --;

        return value;
    }

    //stackTop()
    int stackTop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    //peek()
    int peek(int position)
    {
        int index = top - position + 1;

        if(index < 0 || index > top)
        {
            System.out.println("Invalid index");
            return -1;
        }
        return stack[index];
    }

    //display()
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return ;
        }

        System.out.println("\n Stack elements");

        for(int i = top; i>= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
}
