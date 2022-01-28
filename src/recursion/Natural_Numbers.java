/*
Q2. Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
 */
package recursion;

import java.util.Scanner;

public class Natural_Numbers {
    public static void print(int n)
    {
        if(n==1) {System.out.println(n);return;}
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        print(n);
    }
}
