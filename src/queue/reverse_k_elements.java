package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse_k_elements {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList();
        Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
        for (int i = 0; i < k; i++) {
            q.add(s.pop());
        }
        for (int i = 0; i < n-k; i++) {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
