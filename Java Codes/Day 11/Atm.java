
import java.util.Scanner;

class Atm{
	String accountName;
	Integer accountNumber;
	Integer accountPin;
	Integer accountBalance;
	
	public Atm(String accountName, Integer accountNumber, Integer accountPin, Integer accountBalance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountPin = accountPin;
		this.accountBalance = accountBalance;
	}

	public void printAccountDetails() {
		System.out.println("Account Name : "+ accountName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance Amount : "+ accountBalance);
	}
	
	public void depositMoney(int amount) {
		if(amount > 0) {
			System.out.println("Before Deposit balance : " + this.accountBalance);
			this.accountBalance = this.accountBalance + amount;
			System.out.println("Deposited Successfully");
			System.out.println("After Deposited balance : " + this.accountBalance);
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	
	public void withDrawMoney(int amount) {
		if(amount > 0 &&  amount < accountBalance) {
			System.out.println("Before Withdraw bankBalance : " + accountBalance);
			this.accountBalance = this.accountBalance - amount;
			System.out.println("WithDraw Successfully");
			System.out.println("After Withdraw bankBalance : " + accountBalance);
		}
	}
	
	public void bankBalance() {
		System.out.println("Bank Balance : " +  accountBalance);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Atm atm = new Atm("Arjun", 1234567, 9999, 500000);
		
		while(true) {
			System.out.println("Choose Any One : ");
			System.out.println("1. PrintAccountDetails");
			System.out.println("2. Deposit Money");
			System.out.println("3. WithDraw Money");
			System.out.println("4. Bank Balance");
			
			String choice = sc.nextLine();
			if(choice.equals("stop")) {
				break;
			}
			
			switch (choice) {
			
			case "1" -> {
				atm.printAccountDetails();
			}
			
			case "2" -> {
				System.out.print("Enter thw Deposit Money : ");
				atm.depositMoney(sc.nextInt());
				sc.nextLine();
			}
			
			case "3" -> {
				System.out.print("Enter thw WithDraw Money : ");
				atm.withDrawMoney(sc.nextInt());
				sc.nextLine();
			}
			
			case "4" -> atm.bankBalance();
			
			default -> System.out.println("Invalid Input");
			
			}
			
			
		}
		
	}
}