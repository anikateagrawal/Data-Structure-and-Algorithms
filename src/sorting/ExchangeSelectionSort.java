package sorting;

import java.util.Scanner;

public class ExchangeSelectionSort {
    public static void sort(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            int small=arr[i];
            int pos=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<small)
                {
                    small=arr[j];
                    pos=j;
                }
            }
            int tmp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=tmp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
