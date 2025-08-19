import java.util.Scanner;
public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Oru number podu: ");
        int num = sc.nextInt(); 
        int temp = num;         
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10; 
            int fact = 1;

            // Factorial ah calculate panrom
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact; // Add factorial
            temp = temp / 10; // Next digit
        }

        // Check panna time
        if (sum == num) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Strong illa");
        }

        sc.close();
    }
}

}
