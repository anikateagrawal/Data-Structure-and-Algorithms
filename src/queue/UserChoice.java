package queue;

import java.util.Scanner;

public class UserChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                choice1(args);
                break;
            case 2:
                choice2(args);
                break;
            case 3:
                choice3(args);
                break;
            case 4:
                choice4(args);
                break;
            case 5:
                choice5(args);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

    public static void choice1(String a[]) {
        LinkListQueue<String> q = new LinkListQueue<>();
        for (int i = 0; i < a.length; i++) {
            String s = "";
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].toUpperCase().charAt(j) % 2 == 0) s += "e";
                else s += "o";
            }
            q.enqueue(s);
        }
        q.traverse();
    }

    public static int fibo(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void choice2(String a[]) {
        LinkListQueue<Integer> q = new LinkListQueue<>();
        for (int i = 0; i < a.length; i++) {
            q.enqueue(fibo(Integer.parseInt(a[i])));
        }
        q.traverse();
    }

    public static void choice3(String a[]) {
        LinkListQueue<String> q = new LinkListQueue<>();
        for (int i = 0; i < a.length; i++) {
            int l = a[i].length() / 2;
            char m = a[i].charAt(l);
            String e = "", o = "";
            for (int j = 0; j < l; j++) {
                if (a[i].charAt(j) % 2 == 0) e += a[i].charAt(j);
                else o += a[i].charAt(j);
            }
            StringBuffer s = new StringBuffer(a[i].substring(l + 1));
            s.reverse();
            String result = o + e + m + s;
            q.enqueue(result);
        }
        q.traverse();
    }

    public static void choice4(String a[]) {
        if (a.length > 3)
            System.out.println("Arguments must be less than equal to 3");
        else {
            LinkListQueue<String> q = new LinkListQueue<>();
            for (int i = 0; i < a.length; i++) {
                int s = 0;
                for (int j = 0; j < a[i].length(); j++) {
                    s += (j + 1) * (a[i].charAt(j) - 48);
                }
                q.enqueue("" + s);
            }
            q.traverse();
        }
    }

    public static void choice5(String a[]) {
        LinkListQueue<Boolean> q = new LinkListQueue<>();
        for (int i = 0; i < a.length; i++) {
            boolean f = true;
            for (int j = 0; j < a[i].length() - 1; j++) {
                int d = a[i].charAt(j) - a[i].charAt(j + 1);
                if (d != 1 && d != -1) {
                    f = false;
                    break;
                }
            }
            q.enqueue(f);
        }
        q.traverse();
    }
}
class LinkListQueue <T>{
    Node front,rear;
    class Node<T>
    {
        T data;
        Node next;
        Node(T d)
        {
            data=d;
        }
    }
    public boolean isEmpty()
    {
        return front==null;
    }
    public void enqueue(T d)
    {
        Node<T> n=new Node<>(d);
        if(isEmpty())
        {
            front=rear=n;
        }
        else
        {
            rear.next=n;
            rear=n;
        }
    }
    public void dequeue()
    {
        if(isEmpty())
            System.out.println("underflow");
        else
        {
            System.out.println(front.data+" is deleted");
            front=front.next;
        }
    }
    public void traverse()
    {
        if(isEmpty())
            System.out.println("Queue is empty");
        else
        {
            Node temp=front;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
