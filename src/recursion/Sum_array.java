/*
Q4. Write a program to find and return the sum of all elements of the array. Do this recursively.

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7

 */
package recursion;

import java.util.Scanner;

public class Sum_array {
    public static int sum(int a[],int i)
    {
        if(i==a.length-1)return a[i];
        return a[i]+sum(a,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int [n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(sum(a,0));
    }
}
