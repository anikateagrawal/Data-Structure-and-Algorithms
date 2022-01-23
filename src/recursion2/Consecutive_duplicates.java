package recursion2;

import java.util.Scanner;

public class Consecutive_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r=remove(s,0,'\0');
        System.out.println(r);
    }
    public static String remove(String s,int index,char p)
    {
        if(index==s.length())return "";
        String ss=remove(s,index+1,s.charAt(index));
        if(s.charAt(index)==p)return ""+ss;
        else return s.charAt(index)+ss;
    }
}
