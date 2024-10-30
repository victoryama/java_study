package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		double deposit;
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there any initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		if (initial == 'y'){
			System.out.print("Entern initial deposit value: ");
			deposit = sc.nextDouble();
			account = new Account(accountNumber, name, deposit);
		} else {
			 account = new Account(accountNumber, name);
		}
		
		System.out.println("Account data:\n" + account.toString());
		System.out.print("Enter a deposit vale: ");
		deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: " + account.toString());
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: " + account.toString());		
		sc.close();
	}

}
