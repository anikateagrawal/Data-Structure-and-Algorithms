/*
Q. Enter a string from user and store each character of a string in different nodes of a linked list and print the values

Input :  neeraj

Output :  n -> e -> e -> r -> a -> j
 */
package mix2;

import java.util.Scanner;

public class StringToList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        SinglyLinkedList2 l=new SinglyLinkedList2();
        for (int i = 0; i < s.length(); i++) {
            l.add(s.charAt(i));
        }
        l.traverse();
    }
}
class Node2
{
    char c;
    Node2 next;
    public Node2(char c) {
        this.c = c;
    }
}
class SinglyLinkedList2
{
    Node2 head;
    void add(char c)
    {
        Node2 n=new Node2(c);
        if(head==null) head=n;
        else {
            Node2 tmp=head;
            while(tmp.next!=null)
            {
                tmp=tmp.next;
            }
            tmp.next=n;
        }
    }
    void traverse()
    {
        if(head==null) System.out.println("Empty list");
        else
        {
            Node2 tmp=head;
            while(tmp!=null)
            {
                System.out.println(tmp.c);
                tmp=tmp.next;
            }
        }
    }
}

