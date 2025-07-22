package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Dados da conta");
			System.out.print("Número: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome do cliente: ");
			String holder = sc.nextLine();
			
			System.out.print("Saldo bancário inicial: ");
			double balance = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Valor do saque: ");
			acc.withdraw(sc.nextDouble());

			System.out.println("Novo saldo: " + acc.getBalance());
		}
		catch(DomainException e) {
			System.out.println("WithDaw error: " + e.getMessage());
		}
		sc.close();
	}
}
