/*
GLA University there is various department. It is asked to every dept to conduct meeting for all the employees of GLA University. The central Management asked the dept kindly share starting time and ending time of the meeting in 24 hours format so that after verifying it will be circulated among the GLA employees.
But there is a problem that before circulating the meeting information, the central management will find out if there are any clashes between time or not. If there are clashes it means the employee cannot attend all the meetings. Can you help central management to find it out

// use this class structure

public class TimeInterval
{
 int start;
 int end;
// use constructor, getter and setter methods as per requirement
pubic boolean canAttendMeeting(TimeInterval [ ] tlarr)
{
	// set of statements
}

 Hint:- Single Dimension array
 */
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
