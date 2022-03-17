package linkedlist;

public class DoublyCircularList {
    Node head,tail;
    class Node
    {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
        }
    }
    void insertAtbeg(int d)
    {
        Node n=new Node(d);
        if(head==null)
        {
            head=tail=n;
            n.next=head;
            n.previous=head;
        }
        else
        {
            head.previous=n;
            n.next=head;
            head=n;
            tail.next=head;
            n.previous=tail;
        }
    }
    void insertAtEnd(int d)
    {
        Node n=new Node(d);
        if(head==null)
        {
            head=tail=n;
            n.next=head;
            n.previous=head;
        }
        else
        {
            tail.next=n;
            n.previous=tail;
            n.next=head;
            head.previous=n;
            tail=n;
        }
    }
    void deleteBeg()
    {
        if(head==null) System.out.println("Empty");
        else
        {
            if(head==tail){
                head=tail=null;
                return;
            }
            head=head.next;
            head.previous=tail;
            tail.next=head;
        }
    }
    void deleteEnd()
    {
        if(head==null) System.out.println("Empty");
        else
        {
            if(head==tail){
                head=tail=null;
                return;
            }
            tail=tail.previous;
            tail.next=head;
            head.previous=tail;
        }
    }
    void traverse()
    {
        if(head==null) System.out.println("Empty");
        else
        {
            Node tmp=head;
            do {
                System.out.println(tmp.data);
                tmp=tmp.next;
            }while (tmp!=head);
        }
    }
    void traverseReverse()
    {
        if(head==null) System.out.println("Empty");
        else
        {
            Node tmp=tail;
            do {
                System.out.println(tmp.data);
                tmp=tmp.previous;
            }while (tmp!=tail);
        }
    }
    void count()
    {
        int c=0;
        if(head!=null)
        {
            Node tmp=head;
            do {
                c++;
                tmp=tmp.next;
            }while (tmp!=head);
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        DoublyCircularList l=new DoublyCircularList();
        l.insertAtbeg(20);
        l.insertAtEnd(60);
        l.insertAtbeg(40);
        l.insertAtEnd(50);
        l.traverse();
        System.out.println();
        l.deleteBeg();
        l.deleteEnd();
        l.deleteEnd();
        l.deleteBeg();
        l.traverse();
        System.out.println();
        l.count();
    }
}
