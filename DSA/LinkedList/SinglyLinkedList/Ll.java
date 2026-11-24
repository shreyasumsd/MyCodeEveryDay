package DSA.LinkedList.SinglyLinkedList;

public class Ll 
{
    public static void main(String[] args) 
    {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node head = null;
        singlyLinkedList.printAllNodes(head);

        head = singlyLinkedList.insertAtStart(100, head);
        singlyLinkedList.printAllNodes(head);

        head = singlyLinkedList.insertAtStart(101, head);
        singlyLinkedList.printAllNodes(head);

        head = singlyLinkedList.insertAtStart(102, head);
        singlyLinkedList.printAllNodes(head);

    }    
}
