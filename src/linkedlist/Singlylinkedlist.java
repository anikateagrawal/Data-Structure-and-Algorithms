package linkedlist;

public class Singlylinkedlist
{
    public Node head;
    public void add(int d)
    {
        Node n=new Node(d);
        if(head==null)head=n;
        else {
            n.next=head;
            head=n;
        }
    }
    public void deleteAtIndex(int x)
    {
        if(x>=length()) System.out.println("Index out of range");
        else
        {
            if(x==0){
                head=head.next;
            }
            else {
                Node tmp = head;
                for (int i = 0; i < x - 1; i++) {
                    tmp = tmp.next;
                }
                tmp.next=tmp.next.next;
            }
        }
    }
    public int length()
    {
        int l=0;
        Node tmp=head;
        while(tmp!=null){
            l++;
            tmp=tmp.next;
        }
        return l;
    }
    public int elementAtIndex(int i)
    {
        if(i>=length() || i<0) throw new IndexOutOfBoundsException();
        else
        {
            Node tmp=head;
            for (int j = 0; j < i; j++) {
                tmp=tmp.next;
            }
            return tmp.data;
        }
    }
    public void addAtEnd(int d)
    {
        Node n=new Node(d);
        if(head==null) head=n;
        else {
            Node tmp=head;
            while(tmp.next!=null)
            {
                tmp=tmp.next;
            }
            tmp.next=n;
        }
    }
}