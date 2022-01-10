import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of integers in array");
        int ar[]=new int[sc.nextInt()];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter integer");
            ar[i]=sc.nextInt();
        }
        int l= ar.length;
        for (int i = 0; i < l; i++) {
            for (int j = i+1; j < l; j++) {
                if(ar[i]==ar[j])
                {
                    System.out.println("Duplicates found at indexes "+i+","+j);
                }
            }
        }
    }
}
