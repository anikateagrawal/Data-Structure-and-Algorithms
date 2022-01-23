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
