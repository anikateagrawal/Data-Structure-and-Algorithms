package array_questions;

import java.util.Scanner;

public class trailing_zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int f=1;
        while(n>1)f=f*n--;
        int c=0;
        while(true)
        {
            if(f%10==0)c++;
            else break;
            f/=10;
        }
        System.out.println(c);
    }
}
