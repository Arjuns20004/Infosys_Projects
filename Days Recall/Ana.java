import java.util.Scanner;

public class Ana {
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        String a1=lee.nextLine().replaceAll("\\s", "").toLowerCase();
        String a2=lee.nextLine().replaceAll("\\s", "").toLowerCase();
        if(areAnagram(a1,a2)){
            System.out.println("Ana");
        }
        else{
            System.out.println("Not");
        }
    }

    public static boolean areAnagram(String a1,String a2){
        if(a1.length()!=a2.length()) return false;

        int[] count=new int[26];

        for(char c:a1.toCharArray()){
            count[c-'a']++;
        }

        for(char c:a2.toCharArray()){
        count[c-'a']--;
        }

        for(int i:count){
            if(i!=0) return false;
        }

        return true;

    }
}
