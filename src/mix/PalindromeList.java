/*
Q. Palindrome LinkedList

You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true
Sample Input 2 :
2
0 2 3 2 5 -1
 */
package mix;

import linkedlist.Singlylinkedlist;

import java.util.Scanner;

public class PalindromeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            Singlylinkedlist l = new Singlylinkedlist();
            while (true) {
                int n = sc.nextInt();
                if (n == -1) break;
                l.addAtEnd(n);
            }
            System.out.println(checkPalindrome(l));
        }
    }
    public static boolean checkPalindrome(Singlylinkedlist l)
    {
        for (int i = 0; i < l.length()/2; i++) {
            if(l.elementAtIndex(i)!=l.elementAtIndex(l.length()-i-1))return false;
        }
        return true;
    }
}
