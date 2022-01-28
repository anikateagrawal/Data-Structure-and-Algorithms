/*
Q6. Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print all the  occurrence(index) of search value(7) by holding the index in a result array . Do it recursively

The prototype of the method is as follows:-

public static int[] res(int arr[], int current index, int search_value)
{
	// set of statements;
}
 */
package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAll {
    public static int[] res(int arr[],int currentindex,int search_value)
    {

        if(currentindex==arr.length)return new int[0];
        int r[]=res(arr,currentindex+1,search_value);
        if(arr[currentindex]==search_value)
        {
            int rr[]=new int[r.length+1];
            rr[0]=currentindex;
            for( int j=0;j<r.length;j++)rr[j+1]=r[j];
            r=rr;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int [n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter value to search");
        int s= sc.nextInt();
        int r[]=res(a,0,s);
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }
}
