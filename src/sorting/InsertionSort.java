package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 1; i <n ; i++) {
            int j=i;
            int tmp=arr[i];
            while(j>0&&tmp<arr[j-1])
                arr[j]=arr[--j];
            arr[j]=tmp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
