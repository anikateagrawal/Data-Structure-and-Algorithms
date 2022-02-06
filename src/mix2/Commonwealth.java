/*
Q. The 2022 Commonwealth Games, officially known as the XXII Commonwealth Games and commonly known as Birmingham 2022 are about to start. To help sports commentators determine in real time how countries are doing, the list of gold medals won by each country was originally saved in an array of countries and an array of medals separately. To simplify implementation, information has to be transferred from the existing arrays into a linked list. Write a Java method to transfer country and gold medal data from the arrays into a linked list with all elements in the same order
 */
package mix2;

import java.util.Scanner;

public class Commonwealth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        String countries[]=new String[c];
        int goldmedals[]=new int[c];
        for (int i = 0; i < c; i++) {
            countries[i]= sc.next();
            goldmedals[i]= sc.nextInt();
        }
        SinglyLinkedList l=convertArrayToList(countries,goldmedals);
        l.traverse();
    }
    public static SinglyLinkedList convertArrayToList(String[] c,int[] g)
    {
        SinglyLinkedList l=new SinglyLinkedList();
        for (int i = 0; i < c.length; i++) {
            l.add(g[i],c[i]);
        }
        return l;
    }
}
class Node
{
    int goldmedals;String country;
    Node next;
    public Node(int goldmedals, String country) {
        this.goldmedals = goldmedals;
        this.country = country;
    }
}
class SinglyLinkedList
{
    Node head;
    void add(int d,String c)
    {
        Node n=new Node(d,c);
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
    void traverse()
    {
        if(head==null) System.out.println("Empty list");
        else
        {
            Node tmp=head;
            while(tmp!=null)
            {
                System.out.println(tmp.country+" "+tmp.goldmedals);
                tmp=tmp.next;
            }
        }
    }
}