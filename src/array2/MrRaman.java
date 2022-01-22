package array2;

import java.util.Scanner;

public class MrRaman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of both arrays");
        int myarr1[]=new int[sc.nextInt()];
        int myarr2[]=new int[sc.nextInt()];
        System.out.println("Enter elements of array1");
        for (int i = 0; i < myarr1.length; i++) {
            myarr1[i]= sc.nextInt();
        }
        System.out.println("Enter elements of array2");
        for (int i = 0; i < myarr2.length; i++) {
            myarr2[i]= sc.nextInt();
        }
        for (int i = 0; i < myarr1.length; i++) {
            int c=0;
            for (int j = 0; j < myarr2.length; j++) {
                if(myarr2[j]>=myarr1[i])c++;
            }
            System.out.print(c+",");
        }
    }
}
