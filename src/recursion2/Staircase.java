package recursion2;

import java.util.Scanner;

public class Staircase {
    public static int ways(int n,int one_step,int two_step,int three_step)
    {
        if(one_step+two_step*2+three_step*3>n)return 0;
        if(one_step+two_step*2+three_step*3==n)return 1;
        return ways(n,one_step+1,two_step,three_step)+ways(n,one_step,two_step+1,three_step)+ways(n,one_step,two_step,three_step+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(ways(n,0,0,0));
    }
}
