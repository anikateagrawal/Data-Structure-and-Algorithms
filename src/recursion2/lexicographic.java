package recursion2;

public class lexicographic {
    public static void lexi(int start,int end)
    {
        if(start>end)return;
        int i=0;
        if(start==0)i=1;
        System.out.println(start);
        while(i<10)
        {
            lexi(start*10+i,end);
            i++;
        }
    }

    public static void main(String[] args) {
        lexi(0,100);
    }
}
