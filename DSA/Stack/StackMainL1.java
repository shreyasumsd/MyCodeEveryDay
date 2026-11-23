package DSA.Stack;

public class StackMainL1 
{
    public static void main(String[] args) 
    {
        //obj type is class type
        StackL1 stack = new StackL1(5); 

        System.out.println("isEmpty " + stack.isEmpty());
        System.out.println();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();
        System.out.println();

        System.out.println("Top element " + stack.stackTop());
        System.out.println();

        System.out.println("Element at position 1: " + stack.peek(1));
        System.out.println("Element at position 2: " + stack.peek(2));
        System.out.println("Element at position 3: " + stack.peek(3));
        System.out.println("Element at position 4: " + stack.peek(4));
        System.out.println("Element at position 5: " + stack.peek(5));
        System.out.println();

        System.out.println("Deleted: " + stack.pop());
        System.out.println("Deleted: " + stack.pop());
        System.out.println();

        stack.display();
        System.out.println();

        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println();

        System.err.println("is Full: " + stack.isFull());
        System.out.println();
    }    
}
