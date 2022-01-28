package recursion2;

public class subsequences {
    public static void seq(String s,String a)
    {
        if(s.length()==0) {
            System.out.println(a);
            return;
        }
        seq(s.substring(1),a+s.charAt(0));
        seq(s.substring(1),a);
    }

    public static void main(String[] args) {
        seq("abc","");
    }
}
