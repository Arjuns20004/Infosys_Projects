
public class Factrec {
    public static int fun(int n){
        if(n==0) return 1;
        return fun(n-1)*n;
    }

    public static void main(String args[]){
        int fact=fun(5);
        System.out.println(fact);
    }
}
