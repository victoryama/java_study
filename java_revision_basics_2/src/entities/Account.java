package entities;

public class Account {
	
	private int accountNumber;
	private String name;
	private double value;
	
	public Account(int accountNumber, String name, double value) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(value);
	}
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public double getValue() {
		return value;
	}
	public void deposit(double amount) {
		value += amount;
	}
	public void withdraw(double amount) {
		value -= amount + 5.00;
	}

	@Override
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + ", Balance: $" + value;
	}
	
	
	
}
