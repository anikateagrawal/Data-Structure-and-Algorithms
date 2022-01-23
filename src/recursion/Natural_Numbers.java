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
