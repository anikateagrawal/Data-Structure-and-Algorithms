package recursion;

import java.util.Scanner;

public class Pow_x_n {
    public static int pow(int x,int n)
    {
        if(n==1)return x;
        return x*pow(x,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int n= sc.nextInt();
        System.out.println(pow(x,n));
    }

}
