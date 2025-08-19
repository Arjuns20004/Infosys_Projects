import java.util.*;

class BankAccount {
    String AccountHolder;
    double balance;

    public void setDetails(String AccountHolder, double balance) {
        this.AccountHolder = AccountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + AccountHolder + ", Balance: " + balance);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String AccountHolder = sc.nextLine();
        double initialBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();

        BankAccount account = new BankAccount();
        account.setDetails(AccountHolder, initialBalance);
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);
        account.display();
    }
}
