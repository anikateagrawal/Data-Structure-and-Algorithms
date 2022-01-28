/*
Q. Write a program to remove consecutive duplicate elements in an array.

Input values

10 10 30 30 40 50 50 50 9 45

Output

10 30 40 50 9 45
 */
package array_questions;

import java.util.Scanner;

public class consecutive_duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        int ar[]=new int [n];
        int t=-1;
        ar[++t]=sc.nextInt();
        for (int i = 1; i < ar.length; i++) {
            int m= sc.nextInt();
            if(m!=ar[t])ar[++t]=m;
        }
        for (int i = 0; i <= t; i++) {
            System.out.println(ar[i]);
        }
    }
}
