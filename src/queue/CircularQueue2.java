package queue;

import java.util.Scanner;

public class CircularQueue2 {
    int front,rear,size;
    int queue[];
    public CircularQueue2(int size) {
        this.size=size;
        front = -1;
        rear = -1;
        queue=new int[size];
    }
    public boolean isFull()
    {
        return front==rear&&rear!=-1;
    }
    public boolean isEmpty()
    {
        return front==-1;
    }
    public void enqueue(int d)
    {
        if(isFull()) System.out.println("Queue is full");
        else
        {
            if(rear==-1){
                front=0;
                rear=0;
            }
            queue[rear]=d;
            rear=(rear+1)%size;
            System.out.println(d+" is inserted");
        }
    }
    public void dequeue()
    {
        if(isEmpty()) System.out.println("Queue is empty");
        else
        {
            System.out.println(queue[front]+" is deleted");
            front=(front+1)%size;
            if(front==rear){
                front=-1;
                rear=-1;
            }
        }
    }
    public void traverse() {
        if (isEmpty()) System.out.println("Empty");
        else {
            int i = front;
            do {
                System.out.println(queue[i]);
                i=(i+1)%size;
            }while(i!=rear);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of queue");
        int size= sc.nextInt();
        CircularQueue2 q=new CircularQueue2(size);
        while(true)
        {
            System.out.println("Enter your choice:\n1. To enqueue\n2. To dequeue\n3. To display");
            int c=sc.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("Enter data to insert");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.traverse();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("y to continue n to quit");
            if(sc.next().equals("n"))break;
        }
    }
}
