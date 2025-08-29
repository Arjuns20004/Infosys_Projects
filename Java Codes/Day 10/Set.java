import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set {
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        while (true) {
            System.out.println("Enter a value or stop:");
            String s=lee.nextLine();
            if(s.equalsIgnoreCase("stop")){
                break;
            }
            list.add(Integer.parseInt(s));
        }
        HashSet<Integer> set=new HashSet<Integer>();
        System.out.println(list);
        for(int x:list){
            set.add(x);
        }


        //Iterator<Integer> itr=set.iterator();
        System.out.println(set);

    }    
}
