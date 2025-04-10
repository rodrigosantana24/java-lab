package application;

import java.util.Scanner;

import entities.Rent;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] quartos = new String[9];

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Aluguel #" + (i+1) + ":");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("N° do quarto: ");
			int numero = sc.nextInt();
			
			if(quartos[numero] != null) {
				System.out.println("Quarto ocupado!");
				System.out.print("Selecione outro quarto: ");
				numero = sc.nextInt();
			}
			else {
				Rent estudante = new Rent(nome, email);
				quartos[numero] = estudante.toString();
			}			
			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i=0; i<quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		sc.close();
	}

}
