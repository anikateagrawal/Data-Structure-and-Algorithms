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
