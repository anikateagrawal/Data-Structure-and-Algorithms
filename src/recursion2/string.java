/*
Q. Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.

Sample Input 1 :
abb
Sample Output 1 :
true
Sample Input 2 :
abababa
Sample Output 2 :
false
 */
package recursion2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class string {
    public static boolean check(String s,int index)
    {
        if(index<s.length())
        {
            if(s.charAt(index)=='a')
            {
                return check(s,index+1);
            }
            else if(s.charAt(index)=='b'&&index+1!=s.length()&&s.charAt(index+1)=='b')
            {
                return check(s,index+2);
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        System.out.println(check(s,0));
    }
}
