package recursion2;

public class Permutations {
    public static void permutation(String initial,String ans)
    {
        if(initial.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < initial.length(); i++) {
            permutation(initial.substring(0,i)+initial.substring(i+1),ans+initial.charAt(i));
        }
    }

    public static void main(String[] args) {
        permutation("abc","");
    }
}
