import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = lee.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            System.out.print(ch);
        }
    }
}
