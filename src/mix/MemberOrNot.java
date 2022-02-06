/*Q. Design a method that returns true if element n is a member of given array  and false if not  by using the recursion
 */
package mix;

import java.util.Scanner;

public class MemberOrNot {
    static boolean checkMember(int a[],int i,int n)
    {
        if(i==a.length)return false;
        if(a[i]==n)return true;
        return checkMember(a,i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int a[]=new int[m];
        for (int i = 0; i < m; i++) {
            a[i]= sc.nextInt();
        }
        int n= sc.nextInt();
        System.out.println(checkMember(a,0,n));
    }
}
