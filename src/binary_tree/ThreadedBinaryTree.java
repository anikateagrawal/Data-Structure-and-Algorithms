package binary_tree;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ThreadedBinaryTree {
    static class Node
    {
        String phone;
        Node left;
        Node right;
        boolean rightthread;
        public Node(String data)
        {
            this.phone = data;
        }
    }
        public static Node leftMost(Node root)
        {
            if(root== null)
            {
                return root;
            }
            while(root.left != null)
            {
                root= root.left;
            }
            return root;
        }

        public static void inorder(Node root)
        {
            Node current = leftMost(root);
            while(current != null && current.phone != null)
            {
                check(current.phone);
                if(current.rightthread)
                {
                    current= current.right;
                }
                else
                    current = leftMost(current.right);
            }
        }
        public static void check(String s)
        {
            String a[]=s.split(" ");
            String r="";
            for(int i=0;i<a.length;i++)
            {
                r+=digit(a[i]);
                if(a[i].toLowerCase().equalsIgnoreCase("Double"))r+=digit(a[i+1])+digit(a[++i]);
                else if(a[i].toLowerCase().equalsIgnoreCase("Triple"))r+=digit(a[i+1])+digit(a[i+1])+digit(a[++i]);
                else if(a[i].toLowerCase().equalsIgnoreCase("Penta"))r+=digit(a[i+1])+digit(a[i+1])+digit(a[i+1])+digit(a[i+1])+digit(a[++i]);
            }
            if(Pattern.matches("(0|91)?[7-9][0-9]{9}",r))
                System.out.println(r);
        }
        public static String digit(String s)
        {
            if(s.toLowerCase().equalsIgnoreCase("Zero"))return "0";
            else if(s.toLowerCase().equalsIgnoreCase("One"))return "1";
            else if(s.toLowerCase().equalsIgnoreCase("Two"))return "2";
            else if(s.toLowerCase().equalsIgnoreCase("Three"))return"3";
            else if(s.toLowerCase().equalsIgnoreCase("Four"))return"4";
            else if(s.toLowerCase().equalsIgnoreCase("Five"))return"5";
            else if(s.toLowerCase().equalsIgnoreCase("Six"))return"6";
            else if(s.toLowerCase().equalsIgnoreCase("Seven"))return"7";
            else if(s.toLowerCase().equalsIgnoreCase("Eight"))return"8";
            else if(s.toLowerCase().equalsIgnoreCase("Nine"))return"9";
            else return "";
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Node dummy = new Node(null);
            Node n1 = new Node(sc.nextLine());
            Node n2 = new Node(sc.nextLine());
            Node n3 = new Node(sc.nextLine());
            Node n4 = new Node(sc.nextLine());
            // adding left and right child here
            n1.left = n2;
            n1.right = n3;
            n2.left = n4;
            // utilization of dummy node
            dummy.left = n1;
            dummy.right = dummy;
            dummy.rightthread= true;
            // now adding thread with each of the node
            n4.right = n2;
            n4.rightthread= true;
            n2.right = n1;
            n2.rightthread = true;
            n3.right= dummy;
            n3.rightthread= true;
            inorder(dummy);
        }
    }

