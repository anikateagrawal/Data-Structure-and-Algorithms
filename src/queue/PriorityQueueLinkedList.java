package queue;

/*
A priority queue is a data structure in which each element is assigned a priority.The priority of all element
will be used to determine the order in which the element will be processed.
The general rules of processing the elements of a priority queue are
1) An element with higher priority is processed before an element with lower priority
2) The elements with same priority are processed on a FCFS basis
Basic applications are
1) Bandwidth Management
2) Discrete event simulation
3) Haffman Coding
4) best first search algorithm
5) pri's algorithms for minimumm spanning tree
Two types of Priority Queue
1) Assending priority queue
2) Descending priority queue
 */





public class PriorityQueueLinkedList {
    Node front;
    Node rear;
    class Node
    {
        int data,priority;
        Node next;
        Node(int d,int p)
        {
            data=d;
            priority=p;
        }
    }
    public PriorityQueueLinkedList() {
        front = null;
        rear = null;

    }
    public void enqueue(Node newnode) {
        if (front == null || newnode.priority < front.priority) {
            newnode.next = front;
            front = newnode;
        } else {
            Node temp = front;

            while (temp.next != null && temp.next.priority <= newnode.priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;

        }
    }
    public void display()
    {
        Node temp = front;
        while(temp != null)
        {
            System.out.println(temp.data + " " + temp.priority);
            temp = temp.next;
        }
    }
}
