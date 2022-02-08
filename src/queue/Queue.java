package queue;

import java.util.Scanner;

public class Queue {
    int front,rear,size;
    int queue[];
    public Queue(int size) {
        this.size=size;
        front = 0;
        rear = 0;
        queue=new int[size];

    }
    public boolean isFull()
    {
        return rear==size;
    }
    public boolean isEmpty()
    {
        return front==rear;
    }
    public void enqueue(int d)
    {
        if(isFull()) System.out.println("Queue is full");
        else
        {
            queue[rear++]=d;
            System.out.println(d+" is inserted");
        }
    }
    public void dequeue()
    {
        if(isEmpty()) System.out.println("Queue is empty");
        else
        {
            System.out.println(queue[front]+" is deleted");
            front++;
            if(front==rear)
            {
                front=0;rear=0;
            }
        }
    }
    public void traverse()
    {
        for (int i = front; i < rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of queue");
        int size= sc.nextInt();
        Queue q=new Queue(size);
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
