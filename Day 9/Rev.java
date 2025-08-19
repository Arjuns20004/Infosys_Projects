
public class Rev {
    public static int fun(int n,int rev){
        if(n==0) return rev;
        rev=rev*10+n%10;
        return fun(n/10,rev);
    }

    public static void main(String args[]){
        int fact=fun(12345,0);
        System.out.println(fact);
    }
}
