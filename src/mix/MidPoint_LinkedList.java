/*
Q.Mid Point Linked List

For a given singly linked list of integers, find and return the node present at the middle of the list.


Note : If the length of the singly linked list is even, then return the first middle node.

Example: Consider, 10 -> 20 -> 30 -> 40 is the given list, then the nodes present at the middle with respective data values are, 20 and 30. We return the first node with data 20.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 Output Format :
For each test case/query, print the data value of the node at the middle of the given list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
3
Sample Input 2 :
2
-1
1 2 3 4 -1
Sample Output 2 :
2

 */
package mix;

import linkedlist.Singlylinkedlist;

import java.util.Scanner;

public class MidPoint_LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t--!=0)
        {
            Singlylinkedlist l=new Singlylinkedlist();
            while (true)
            {
                int n= sc.nextInt();
                if (n==-1)break;
                l.addAtEnd(n);
            }
            if(l.length()==0)continue;
            if(l.length()%2==0)
            {
                System.out.println(l.elementAtIndex(l.length()/2-1));
            }
            else System.out.println(l.elementAtIndex(l.length()/2));
        }
    }
}
