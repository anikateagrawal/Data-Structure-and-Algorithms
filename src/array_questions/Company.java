package array_questions;

import java.util.Scanner;

public class Company {
    int products[];

    public Company(int ... products) {
        this.products = products;
    }
}
class Sales {
    public static void main(String[] args) {
        Company salesman[] = new Company[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0;i < salesman.length;i ++) {
            System.out.println("Enter the sales of 3 items sold by salesman "+(i+1));
            salesman[i]=new Company(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < salesman.length; i++) {
            int sum=0;
            for (int j = 0; j < salesman[i].products.length; j++) {
                sum=sum+salesman[i].products[j];
            }
            System.out.println("Total sales by salesman "+(i+1)+" = "+sum);
        }
        for (int i = 0; i < 3; i++) {
            int sum=0;
            for (int j = 0; j < salesman.length; j++) {
                sum=sum+salesman[j].products[i];
            }
            System.out.println("Total sales of item "+(i+1)+"="+sum);
        }
    }
}
