package array2;

import java.util.Scanner;

public class GameEntry {
    private int score;
    private String name;

    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "("+ score + "," + name + ')';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of entries");
        int n=sc.nextInt();
        GameEntry[] ar=new GameEntry[n];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter score and name");
            ar[i]=new GameEntry(sc.nextInt(), sc.next());
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length-i-1; j++) {
                if(ar[j].getScore()<ar[j+1].getScore()){
                    GameEntry tmp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=tmp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
