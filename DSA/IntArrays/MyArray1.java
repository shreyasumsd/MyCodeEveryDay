package DSA.IntArrays;

public class MyArray1 {
    public static void main(String[] args) 
    {
        //Memory created 
        ArrayOperations MyArray = new ArrayOperations();
        
        System.out.println("Initial Array");

        MyArray.printElements();

        MyArray.inserAtEnd(10);
        MyArray.inserAtEnd(20);

        System.out.println("After inserting 10 and 20 at end");
        MyArray.printElements();

        MyArray.insertAtStart(5);

        System.out.println("\nAfter inserting 5 at start");
        MyArray.printElements();

        MyArray.InsertAtAnyPosition(15, 2);

        System.out.println("After inserting at any position");
        MyArray.printElements();

        //Invalid positions
        MyArray.InsertAtAnyPosition(99, -1);
        MyArray.InsertAtAnyPosition(100, 7);

        System.out.println("Inserting after invalid positions");
        MyArray.printElements();

        //Array Full
        MyArray.inserAtEnd(30);
        MyArray.insertAtStart(1);
        MyArray.InsertAtAnyPosition(30, 2); 

        // Deletion ====================================================

        MyArray.deleteFromEnd();
        System.out.println("After Deleting");
        MyArray.printElements();

        MyArray.deleteFromStart();
        System.out.println("After Deleting");
        MyArray.printElements();

        MyArray.deleteFromAnyPosition(3);
        System.out.println("After Deleting");
        MyArray.printElements();
    }   
}
