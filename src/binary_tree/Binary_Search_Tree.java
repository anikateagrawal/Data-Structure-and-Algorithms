package binary_tree;

import java.util.Scanner;

public class Binary_Search_Tree {
    Binary_Node root;
    public void insert(int data)
    {
        Binary_Node n=new Binary_Node(data);
        if(root==null)
        {
            root=n;
        }
        else
        {
            add(root,n);
        }
    }
    public boolean add(Binary_Node root,Binary_Node n)
    {
        if(root==null)return true;
        if(root.data>n.data) {
            boolean r = add(root.left, n);
            if (r == true) root.left = n;
            return false;
        }
        else if(root.data<n.data)
        {
            boolean r=add(root.right,n);
            if (r==true)root.right=n;
            return false;
        }return false;
    }
    public void inOrderTraversal(Binary_Node root)
    {
        if(root==null)return;
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
    public void preOrderTraversal(Binary_Node root)
    {
        if(root==null)return;
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void postOrderTraversal(Binary_Node root)
    {
        if(root==null)return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }
    public boolean search(Binary_Node root,int value)
    {
        if (root==null)return false;
        boolean r;
        if(value< root.data)r=search(root.left,value);
        else if(value> root.data)r=search(root.right,value);
        else return true;
        return r;
    }
    public int sum(Binary_Node root)
    {
        if(root==null)return 0;
        return sum(root.left)+sum(root.right)+ root.data;
    }
    public void printPrime(Binary_Node root)
    {
        if(root==null)return;
        if(root.right!=null&&isPrime(root.right.data)) {
            System.out.println(root.right.data+" is prime ");
            if(root.left!=null) System.out.println("\b its left is "+root.left.data);
        }
        if (root.left!=null&&isPrime(root.left.data))
        {
            System.out.println(root.left.data+" is prime ");
            if(root.right!=null) System.out.println("its right is "+root.right.data);
        }
        printPrime(root.left);
        printPrime(root.right);
    }
    public boolean isPrime(int data)
    {
        int c=0;
        for (int i = 1; i <=data ; i++) {
            if(data%i==0)c++;
        }
        return c==2;
    }
    public static void main(String args[])
    {
        Binary_Search_Tree o=new Binary_Search_Tree();
       /* o.insert(11);
        o.insert(9);
        o.insert(7);
        o.insert(10);
        o.insert(12);
        o.inOrderTraversal(o.root);
        o.preOrderTraversal(o.root);
        o.postOrderTraversal(o.root);
        System.out.println(o.search(o.root,15));
        System.out.println(o.sum(o.root));
       */
        while (true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your choice\n1. To insert\n2. To traverse\n3.To search\n4.To print sum\n5.To print prime");
            int c=sc.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("Enter value to insert");
                    o.insert(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter 1 for pre order, 2 for in order, 3 for post order traversal");
                    switch (sc.nextInt())
                    {
                        case 1:
                            o.preOrderTraversal(o.root);
                            break;
                        case 2:
                            o.inOrderTraversal(o.root);
                            break;
                        case 3:
                            o.postOrderTraversal(o.root);
                            break;
                        default:
                            System.out.println("Wrong choice");
                    }
                    break;
                case 3:
                    System.out.println("Enter value to search");
                    if(o.search(o.root, sc.nextInt())) System.out.println("Found");
                    else System.out.println("Not found");
                    break;
                case 4:
                    System.out.println(o.sum(o.root));
                    break;
                case 5:
                    Binary_Node n=new Binary_Node(0);
                    n.left= o.root;
                    o.printPrime(n);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Enter n to exit");
            if(sc.next().equalsIgnoreCase("n"))break;
        }
    }
}
