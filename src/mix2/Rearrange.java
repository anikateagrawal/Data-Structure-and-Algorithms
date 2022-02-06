/*
Q. Print an array that contains the exact same number as the given array, but rearrange so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

Rearrange ([3,3,2]) -> [2,3,3]
Rearrange(0,1,0,1,1,]) -> [0,0,1,1,1]
 */
package mix2;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int rearranged[]=new int [n];
        int k=0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0)rearranged[k++]=a[i];
        }
        for (int i = 0; i < n; i++) {
            if(a[i]%2==1)rearranged[k++]=a[i];
        }
        System.out.println(Arrays.toString(rearranged));
    }
}
