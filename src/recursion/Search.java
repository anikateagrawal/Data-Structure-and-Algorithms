package recursion;

import java.util.Scanner;

public class Search {
    public static int find(int arr[],int currentindex,int search_value)
    {
        if(currentindex==arr.length)return -1;
        if(arr[currentindex]==search_value)return currentindex;
        return find(arr,currentindex+1,search_value);
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
        System.out.println(find(a,0,s));
    }
}
