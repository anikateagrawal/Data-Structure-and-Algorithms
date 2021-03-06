/*
Q. Write a program to input the elements of a two- dimensional array. Then from this array, make two arrays one that stores all odd elements of the two-dimensional array and the other that stores all even elements of the array. 
Note:-  Resulting arrays will be of ArrayList type
 */
package array2;

import java.util.ArrayList;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int m=sc.nextInt();
        int n= sc.nextInt();
        int ar[][]=new int[m][n];
        ArrayList<Integer> even=new ArrayList();
        ArrayList<Integer> odd=new ArrayList();
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < n; j++) {
                int p= sc.nextInt();
                if(p%2==0)even.add(p);
                else odd.add(p);
                ar[i][j]=p;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
