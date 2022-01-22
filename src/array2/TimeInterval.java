package array2;

import java.util.Scanner;

public class TimeInterval {
    private int start,end;

    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    public static boolean canAttendMeeting(TimeInterval [] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j==i)continue;
                if (arr[i].start>=arr[j].start && arr[i].start<arr[j].end){
                    return false;
                }
            }
        }
        return true;
    }
}
class test
{
    public static void main(String[] args) {
        TimeInterval[] arr=new TimeInterval[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new TimeInterval(sc.nextInt(), sc.nextInt());
        }
        System.out.println(TimeInterval.canAttendMeeting(arr));
    }
}
