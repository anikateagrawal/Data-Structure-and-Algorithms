/*
Q. write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into a corresponding integer and return the answer.

Sample Input:
“2029”

Sample Output:
2029
 */
package recursion2;

import java.util.Scanner;

public class Str_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int r=replace(s,s.length()-1);
        System.out.println(r);
    }
    public static int replace(String s,int index)
    {
        if(index==0)return s.charAt(index)-48;
        return replace(s,index-1)*10+s.charAt(index)-48;
    }
}
