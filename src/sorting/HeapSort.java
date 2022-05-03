package sorting;

import java.util.Scanner;

public class HeapSort {
    public static void sort(int arr[])
    {
        for (int i = arr.length/2-1; i>=0;i--) {
            heapify(arr,arr.length,i);
        }
        for (int i = arr.length-1; i >0 ; i--) {
            int tmp=arr[0];
            arr[0]=arr[i];
            arr[i]=tmp;
            heapify(arr,i,0);
        }
    }
    public static void heapify(int arr[],int n,int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l >= n||r>=n) return;
        if (arr[l] > arr[largest]) largest = l;
        if (arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            heapify(arr, n, largest);
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
