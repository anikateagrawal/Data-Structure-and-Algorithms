/*
Q. Write a Java class, Flower, that has three instance variables of type String, int, and float, which respectively represent the name of the flower, its number of petals, and price. Your class must include a constructor method that initialises each variable to an appropriate value, and your class should include methods for setting the value of each type, and getting the value of each type. Create an array of 5 Flower objects and print the value.
 */
package array2;

import java.util.Scanner;

public class Flower {
    private String name;
    private int petals;
    private float price;

    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Flower ar[]=new Flower[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name, number of petals and price of flower");
            ar[i]=new Flower(sc.next(), sc.nextInt(), sc.nextFloat());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(ar[i].getName()+" "+ar[i].getPetals()+" "+ar[i].getPrice());
        }
    }
}
