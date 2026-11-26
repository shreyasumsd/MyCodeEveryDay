package DSA.LinkedList.SinglyLinkedList;

public class SinglyLinkedList 
{
    private Node head;
    private int count;

    public SinglyLinkedList()
    {
        this.head = null;
        this.count = 0;
    }

    public void printAllNodes()
    {
        System.out.println();
        //print head

        System.out.println("Number of count: " + count);

        System.out.print("head --> ");
        //null check
        if(this.head==null)
        {
            System.out.println("linked list is null");
            return;
        }
        else{
            Node walker=this.head;
            while(walker!=null)
            {
                System.out.print(walker.data+" --> ");
                walker=walker.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public void insertAtStart(int value)
    {
        Node newNode = new Node(value);
        if(this.head == null)
        {
            this.head =  newNode;
        }
        else
        {
            newNode.next = this.head;
            this.head =  newNode;
        }
        this.count++;
    }

    public void insertAtEnd(int value)
    {
        Node newNode=new Node(value);

        if(this.head==null)
        {
            this.head=newNode;
            return;
        }
        else
        {
            Node currentNode=this.head;
            while(currentNode.next!=null)
            {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }
        this.count++;
    }

    public void insertAtPosition(int value, int position)
    {

        if(position < 1 || position > this.count)
        {
            System.out.println("Invalid position: ");
            return;
        }

        if(position == 1)
        {
            this.insertAtStart(value);
            return;
        }

        if(position == this.count)
        {
            this.insertAtEnd(value);
            return;
        }

        Node currentNode = this.head;
        int count =1;

        //Step 1: create a new node 
        Node newNode=new Node(value);

        //step 2: Take the current node to position-1 node
        while(count < position -1)
        {
            currentNode =currentNode.next;
            count++;
        }
        // Step 3
        newNode.next = currentNode.next;

        // Step 4
        currentNode.next = newNode;
        
        //Step 5 
        this.count++;
    }

    //search Home work
    public boolean search(int key)
    {
        if(this.head == null)
        {
            System.out.println("List is empty");
            return false;
        }

        Node currentNode = this.head;
        while(currentNode != null)
        {
            if(currentNode.data == key)
            {
                System.out.println("Key is found: ");
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    //Skip one element and print next
    public void skipNextNode()
    {
        System.out.println();

        System.out.print("head --> ");
        Node walker = this.head;

        while(walker != null)
        {
            System.out.print(walker.data + " --> ");
            if(walker.next == null)
            {
                break;
            }
            walker = walker.next.next;
        }
        System.out.println("null");
    }

    public void deleteAtStart()
    {
        //list is empty
        if(this.head == null)
        {
            System.out.println("List is empty");
            return;
        }
        //single node 
        this.head = this.head.next;
        this.count--;
    }

    public void deleteAtEnd()
    {
        //list is empty
        if(this.head == null)
        {
            System.out.println("List is empty");
            return;
        }

        //list has only one node 
        if(this.head.next == null)
        {
            this.head = null;
            return;
        }
        
        //list has many nodes
        Node currentNode = this.head;
        while(currentNode.next.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next =null;
        this.count--;
    }

    public void deleteAtAnyPosition(int position)
    {
    if(position < 1 || position > this.count)
    {
        System.out.println("Invalid position");
        return;
    }

    if(position == 1)
    {
        this.deleteAtStart();
        return;
    }

    if(position == this.count)
    {
        this.deleteAtEnd();
        return;
    }

    Node walker = this.head;
    int count = 1;

    while(count < position - 1)
    {
        walker = walker.next;
        count++;
    }

    walker.next = walker.next.next;
    this.count--;
    }

    public boolean findLoop() //========================
    {
        if(this.head == null)
        {
            return false;
        }

        Node slow = this.head;
        Node fast = this.head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return true;
            }
        }

        return false;
    }

    public void findMiddleNode()
    {
        if(this.head == null)
        {
            System.out.println("List is empty");
            return;
        }

        Node slow = this.head;
        Node fast = this.head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.data);
    }
}