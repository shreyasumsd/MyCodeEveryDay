package DSA.LinkedList.SinglyLinkedList;

public class SLLMain 
{
    public static void main(String[] args) 
    {
        SinglyLinkedList singly = new SinglyLinkedList(); //object created
        // SinglyLinkedList luckyNumber = new SinglyLinkedList();

        singly.printAllNodes();
        

        singly.insertAtStart(100);
        singly.printAllNodes();

        singly.insertAtStart(101);
        singly.printAllNodes();

        // luckyNumber.insertAtStart(30);
        // luckyNumber.printAllNodes();

        singly.insertAtStart(102);
        singly.printAllNodes();

        // luckyNumber.insertAtEnd(40);
        // luckyNumber.printAllNodes();

        singly.insertAtEnd(999);
        singly.printAllNodes();

        // luckyNumber.insertAtEnd(10);
        // luckyNumber.printAllNodes();

        // luckyNumber.insertAtEnd(20);
        // luckyNumber.printAllNodes();

        singly.insertAtPosition(777, 03);
        singly.printAllNodes();

        singly.insertAtPosition(888, 2);
        singly.printAllNodes();

        // singly.insertAtAnywhere(1033, 3);
        // singly.printAllNodes();

        boolean result = singly.search(4);
        System.out.println();
        System.out.println("Key is: " + result);
        
        singly.skipNextNode();

        singly.deleteAtStart();
        singly.printAllNodes();

        singly.deleteAtEnd();
        singly.printAllNodes();

        // singly.deleteAtAnyPosition(3);
        // singly.printAllNodes();

        // singly.deleteAtAnyPosition(4);
        // singly.printAllNodes();
        System.out.println();

        System.out.println("Has loop: " + singly.findLoop());
        System.out.println();

        singly.findMiddleNode();



    }    
}
