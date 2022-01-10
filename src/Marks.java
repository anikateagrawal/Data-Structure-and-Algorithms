import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int[][] marks=new int[4][5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of student " + (i + 1));
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        int count_score_below50=0;
        for (int i = 0; i < 5; i++) {
            float average_subject_marks=0;
            for (int j = 0; j < 4; j++) {
                average_subject_marks=average_subject_marks+marks[j][i];
            }
            average_subject_marks=average_subject_marks/4;
            System.out.println("Average marks in subject "+(i+1)+" "+average_subject_marks);
        }
        for (int i = 0; i < 4; i++) {
            float average_student_marks=0;
            for (int j = 0; j < 5; j++) {
                average_student_marks=average_student_marks+marks[i][j];
            }
            average_student_marks=average_student_marks/5;
            if(average_student_marks<50)count_score_below50++;
            System.out.println("Average marks of student "+(i+1)+"="+average_student_marks);
        }
        System.out.println("Number of students who scored below 50 in their average="+count_score_below50);
        for (int i = 0; i < 4; i++) {
            System.out.print("Marks of student "+(i+1)+"=> ");
            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j]+" , ");
            }
            System.out.println();
        }
    }
}

