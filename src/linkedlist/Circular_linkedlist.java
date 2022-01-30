package linkedlist;

public class Circular_linkedlist {
    Node head,tail;
    public void add(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
            n.next=head;
        }
        else
        {
            tail.next=n;
            tail=n;
            tail.next=head;
        }
    }
    public void deleteEnd()
    {
        if(head==null) System.out.println("Nothing in list");
        else {
            Node tmp=head;
            while (tmp.next != tail) tmp = tmp.next;
            tmp.next = head;
            tail = tmp;
        }
    }
    public void deleteBegin()
    {
        if(head==null) System.out.println("Nothing in list");
        else {
            head=head.next;
            tail.next=head;
        }
    }
    public void deletePos(int p)
    {
        if(head==null) System.out.println("No list");
        else {
            if(p==1){
                if(tail==head){
                    head=null;tail=null;
                }
                else {
                    head=head.next;
                    tail.next=head;
                }
            }
            else {
                Node tmp=head;
                for (int i = 1; i < p-1; i++) {
                    tmp=tmp.next;
                }
                tmp.next=tmp.next.next;
            }
        }
    }
    public void display()
    {
        if(head==null) System.out.println("no list");
        else {
            Node tmp=head;
            do{
                System.out.println(tmp.data);
                tmp=tmp.next;
            }
            while(tmp!=head);
        }
    }
    public static void main(String[] args) {
        Circular_linkedlist l=new Circular_linkedlist();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.display();
        System.out.println();
        //l.deleteBegin();
        //l.display();
        //System.out.println();
        //l.deleteEnd();
        //l.display();
        //System.out.println();
        l.deletePos(3);
        l.display();
    }
}

