package DSA.LinkedList.SinglyLinkedList;

public class SinglyLinkedList 
{
    public void printAllNodes(Node localHead)
    {
        System.out.println();
        //print head

        System.out.print("head --> ");
        //null check
        if(localHead==null)
        {
            System.out.println("linked list is null");
            return;
        }
        else{
            Node walker=localHead;
            while(walker!=null)
            {
                System.out.print(walker.data+" --> ");
                walker=walker.next;
            }
            System.out.print("null");
        }
    }

    public Node insertAtStart(int value,Node localHead)
    {
        Node newNode=new Node(value);
        if(localHead==null)
        {
            return newNode;
        }
        else{
            newNode.next=localHead;
            return newNode;

        }
    }
}
