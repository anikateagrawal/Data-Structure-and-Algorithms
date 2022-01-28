/*
Q. Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].

Example

Imagine the size of both the arrays are 5

myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,2
 */
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
