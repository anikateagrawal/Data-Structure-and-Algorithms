/*Q. Write a recursive function to convert a decimal no into a binary no, print the binary number.
 */
package mix;

import java.util.Scanner;

public class Dec_Bin_Rec {
    static int deciToBin(int n)
    {
        if(n==0)return 0;
        int d=n%2;
        return deciToBin(n/2)*10+d;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(deciToBin(n));
    }
}
