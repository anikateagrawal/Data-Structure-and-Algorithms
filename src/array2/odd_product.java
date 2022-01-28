/*
Q. Write a short Java function that takes an array of int values  as an argument and determines if there is a pair of numbers in the array whose product is odd.

 */
package array2;

import java.util.Scanner;

public class odd_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i]= sc.nextInt();
        }
        System.out.println(check(ar));
    }
    static boolean check(int ar[])
    {
        int c=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]%2==1)c++;
            if(c==2)return true;
        }
        return false;
    }
}
