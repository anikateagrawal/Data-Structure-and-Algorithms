import java.util.Arrays;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1[] =sc.nextLine().split(",");
        int a1[]=new int[s1.length];
        for (int i = 0; i < a1.length; i++) {
            a1[i]=Integer.parseInt(s1[i]);
        }
        String s2[] =sc.nextLine().split(",");
        int a2[]=new int[s2.length];
        for (int i = 0; i < a2.length; i++) {
            a2[i]=Integer.parseInt(s2[i]);
        }
        int m=Integer.MAX_VALUE;
        int n1=a1.length,n2= a2.length;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if(a1[i]==a2[j] && a1[i]<m)
                {
                    m=a1[i];
                }
            }
        }
        if(m==Integer.MAX_VALUE) System.out.println(-1);

        else {
            while (m > 9) {
                int p = m, s = 0;
                while (p > 0) {
                    s = s  + p % 10;
                    p /= 10;
                }
                m = s;
            }
            if (m == 0 || m > n1 || m > n2) System.out.println(-1);
            else {
                int r[][]=new int [2][m];
                Arrays.sort(a1);
                Arrays.sort(a2);
                int k = 0;
                for (int i = m - 1; i >= 0; i--) {
                    r[0][k] = a1[a1.length - i - 1];
                    r[1][k] = a2[a2.length - i - 1];
                    k++;
                }
                for (int i = 0; i < m - 1; i++) {
                    System.out.print(r[0][i] + ",");
                }
                System.out.println(r[0][m - 1]);
                for (int i = 0; i < m - 1; i++) {
                    System.out.print(r[1][i] + ",");
                }
                System.out.println(r[1][m - 1]);
            }
        }
    }
}
