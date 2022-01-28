/*
Q. Create an array of 10 students and print the record of those students who got the highest marks and who got minimum marks. The structure of student class is as follows
class Student
{
	private int rollno;
	private int marks
	private String name;
}
// create constructor or getter and setter methods as per need
 */
package array_questions;

import java.util.Scanner;

public class Student {
    private int rollno,marks;
    private String name;

    public Student(String name, int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
class DuplicatesMax_Min
{
    public static void main(String[] args) {
        Student ar[]=new Student[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <ar.length ; i++) {
            System.out.println("Enter name,roll no,marks");
            ar[i]=new Student(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        }
        int max=ar[0].getMarks();int min=ar[0].getMarks();
        for (int i = 1; i < ar.length; i++) {
            if(ar[i].getMarks()>max)max=ar[i].getMarks();
            else if(ar[i].getMarks()<min)min=ar[i].getMarks();
        }
        System.out.println("Maximum Mark Students");
        for (var i:ar) {
            if(i.getMarks()==max) System.out.println(i.getName()+" "+i.getRollno()+" "+i.getMarks());
        }
        System.out.println("Minimum Mark Students");
        for (var i:ar) {
            if(i.getMarks()==min) System.out.println(i.getName()+" "+i.getRollno()+" "+i.getMarks());
        }
    }
}
