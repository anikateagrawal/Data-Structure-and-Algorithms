package array2;

import java.util.Scanner;

public class Employee {
    int emp_id;
    String name,first_name,last_name,address,area,city,state,designation;
    int salary;

    public Employee(int emp_id, String first_name, String last_name, String area, String city, String state, String designation, int salary) {
        this.emp_id = emp_id;
        this.name = first_name+" "+last_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = area+","+city+","+state;
        this.area = area;
        this.city = city;
        this.state = state;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of employees");
        int n=sc.nextInt();
        Employee ar[]=new Employee[n];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter emp_id,first name, last name, area, city, state,designation,salary");
            ar[i]=new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
