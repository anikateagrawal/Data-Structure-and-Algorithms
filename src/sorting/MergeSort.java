package sorting;

import java.util.Scanner;

public class MergeSort {
    public static void sort(int arr[],int l,int u) {
        if (l < u) {
            int m = (l + u) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, u);
            merge(arr, l, m, u);
        }
    }
    public static void merge(int arr[],int l,int m,int u)
    {
        int ll=m-l+1,rl=u-m;
        int larr[]=new int[ll];
        int rarr[]=new int[rl];
        for (int i = 0; i <ll; i++) {
            larr[i]=arr[l+i];
        }
        for (int i = 0; i < rl; i++) {
            rarr[i]=arr[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<ll&&j<rl)
        {
            if(larr[i]<=rarr[j])
                arr[k]=larr[i++];
            else
                arr[k]=rarr[j++];
            k++;
        }
        while(i<ll)arr[k++]=larr[i++];
        while(j<rl)arr[k++]=rarr[j++];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        sort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
