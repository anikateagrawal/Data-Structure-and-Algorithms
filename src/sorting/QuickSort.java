package sorting;

/* Quick Sort
This algorithm is based on divide and conquer algorithm (We take the bigger problem , break it down to the smaller problem, try to solve the solution to
smaller problem and then join the smaller solutions to get the final result
concept of quick sort algorithm
===============================
At each step it finds "pivot" (Means point of division)and then make sure that all the smaller elements are at left side of the pivot and all bigger
elements are at right side of pivot. This we will do multiple times(Recursively) so that we get the final answer
*/

public class QuickSort {
    static class Node
    {
        int data;
        String str;
        Node(int d,String s)
        {
            data=d;
            str=s;
        }
    }
    public static void quicksort(Node arr[], int start, int end)
    {
        if (start < end) {
            int pivot = partition(arr, start, end);
            // recursively calling the method here
            // left side of array
            quicksort(arr, start, pivot-1 );
            // right side of array
            quicksort(arr, pivot + 1,end);
        }
    }
    // here in this partition method we are going to break down the array
    // main logic of quick sort
    public static int partition(Node arr[], int p , int q )
    {
        int pivot=q;
        int i = p-1;
        for(int j =p; j<=q;j++)
        {
            if(arr[j].data<=arr[pivot].data)
            {
                i++;
                Node temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } // end of the loop
        return i;
    }
    public static void display(Node arr[])
    {
        for(int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i].data+" "+arr[i].str);
        }
    }
    public static void main(String[] args) {
        Node arr[] = new Node[10];
        arr[0]=new Node(1,"a");
        arr[1]=new Node(3,"b");
        arr[2]=new Node(3,"c");
        arr[3]=new Node(5,"d");
        arr[4]=new Node(3,"e");
        arr[5]=new Node(5,"f");
        arr[6]=new Node(4,"g");
        arr[7]=new Node(5,"h");
        arr[8]=new Node(6,"i");
        arr[9]=new Node(5,"j");
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}
