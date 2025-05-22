package Encapsulation;

public class BankAccount {
    
	//The BankAccount class encapsulates the accountNumber and balance fields by making them private.
	//Bundles data and methods restricts direct access to data
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds or invalid amount.");
		}
	}
}

