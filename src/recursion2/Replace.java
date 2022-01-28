/*
Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1 with character c2 in the given string. Do this recursively.

Sample Input :
abaca
a x
Sample Output :
xbxcd

 */
package recursion2;

import java.util.Arrays;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        System.out.println(replace(s,c1,c2,0));
    }
    public static String replace(String s,char c1,char c2,int index)
    {
        if(index==s.length())return "";
        String ss=replace(s,c1,c2,index+1);
        if(s.charAt(index)==c1)return c2+ss;
        else return s.charAt(index)+ss;
    }
}
