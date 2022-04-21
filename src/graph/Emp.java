package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Emp {
    private int id;
    private String name;
    private int salary;
    static ArrayList<Emp> emp;
    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " " + name+" ";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Emp e1=new Emp(sc.nextInt(), sc.next(), sc.nextInt());
        Emp e2=new Emp(sc.nextInt(), sc.next(), sc.nextInt());
        Emp e3=new Emp(sc.nextInt(), sc.next(), sc.nextInt());
        Emp e4=new Emp(sc.nextInt(), sc.next(), sc.nextInt());
        Gmap gmap=new Gmap();
        gmap.add(e1,e2,true);
        gmap.add(e1,e4,true);
        gmap.add(e1,e3,true);
        gmap.add(e2,e4,true);
        gmap.add(e3,e4,true);
        gmap.bfsTraverse(e1);
        gmap.print();
        gmap.ssspByBfs(e2);
        emp=new ArrayList<>();
        emp.add(e1);emp.add(e2);emp.add(e3);emp.add(e4);

        Emp e[]=new Emp[4];
        e[0]=e1;e[1]=e2;e[2]=e3;e[3]=e4;
        int a[][]=new int[4][4];
        add(e1,e2,true,a);
        add(e1,e4,true,a);
        add(e1,e3,true,a);
        add(e2,e4,true,a);
        add(e3,e4,true,a);
        /*a[0][1]=1;
        a[0][2]=1;
        a[0][3]=1;
        a[1][0]=1;
        a[1][3]=1;
        a[2][0]=1;
        a[2][3]=1;
        a[3][0]=1;
        a[3][1]=1;
        a[3][2]=1;
        System.out.print("\t ");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]);
        }
        System.out.println();

         */
        System.out.println("  "+emp);
        for (int i = 0; i < a.length; i++) {
            System.out.print(e[i]);
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("\t"+a[i][j]);
            }
            System.out.println();
        }
    }
    public static void add(Emp v1,Emp v2,boolean b,int a[][])
    {
        a[emp.indexOf(v1)][emp.indexOf(v2)]=1;
        if(b)
        {
            a[emp.indexOf(v2)][emp.indexOf(v1)]=1;
        }
    }
}
