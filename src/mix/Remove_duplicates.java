/*
Q. In a sorted linked list (elements are sorted in ascending order), eliminate duplicates from the given linked list, such that output linked list contains only unique elements.
 */
package mix;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Remove_duplicates {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            int n= sc.nextInt();
            if (n == -1) {
                break;
            }
            l.add(n);
        }
        Collections.sort(l);
        removeDuplicates(l,1,l.get(0));
        System.out.println(l);
    }
    static void removeDuplicates(LinkedList l,int i,Integer p)
    {
        if(i==l.size())return;
        if(p==l.get(i)){
            l.remove(i);
            removeDuplicates(l,i,p);
        }
        else {
            removeDuplicates(l,i+1, (Integer) l.get(i));
        }
    }
}
