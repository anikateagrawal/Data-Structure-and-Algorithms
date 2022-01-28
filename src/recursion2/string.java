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
