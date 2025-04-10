package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account client1;
				
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter a deposit value: ");
			double initialDeposit = sc.nextDouble();
			client1 = new Account(number, name, initialDeposit);
		}
		else {
			client1 = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(client1);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		client1.deposit(value);
		System.out.println("Update account data: ");
		System.out.println(client1);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		client1.sake(value);
		System.out.println("Update account data: ");
		System.out.println(client1);
		
		sc.close();

	}

}
