/*
Me Bean is very good in mathematics. He was given a number n and was told to find out number of trailing zeroes in n! (Factorial) . Can you help him?

Sample Input
5
Sample Output
1
Explanation
5! (Factorial) is 120, so there is one trailing zero.

Implement it by using loop
 */
package array_questions;

import java.util.Scanner;

public class trailing_zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int m=n;
        long f=1;
        while(n>1)f=f*n--;
        int c=0;
        System.out.println("Factorial="+f);
        while(true)
        {
            if(f%10==0)c++;
            else break;
            f/=10;
        }
        System.out.println(c);

        //complexity O(log 5 (n))
        c=0;
        for (int i = 5; m/i>=1 ; i*=5) {
            c+=m/i;
        }
        System.out.println(c);
    }
}
