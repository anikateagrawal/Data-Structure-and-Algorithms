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
