/*
Q. The Olympic results are given in a table, where each row represents a country, and columns represent gold, silver, and bronze medals. For example, the element r[0][0] is the number of gold medals earned by the 0-th country. Write a method that takes the table as an input, and returns a new array which lists the total number of medals for each country. For example, if we start with the table
     2   0   1
     3   2   0
     0   0   2
in which the 0-th country earned 2 + 0 + 1 = 3 medals, the 1-st country earned 3 + 2 + 0 = 5 medals, and the 2nd country earned 0 + 0 + 2 = 2 medals, your method should return an array with values
   3
   5
   2


 */
package mix2;

import java.util.Arrays;
import java.util.Scanner;

public class Olympic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        int a[][]=new int [c][3];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(medals(a)));
    }
    public static int[] medals(int [][] a)
    {
        int c[]=new int [a.length];
        for (int i = 0; i < a.length; i++) {
            int s=0;
            for (int j = 0; j < a[i].length; j++) {
                s+=a[i][j];
            }
            c[i]=s;
        }
        return c;
    }
}
