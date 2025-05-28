package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<PessoaFisica> listaPf = new ArrayList<>();
		List<PessoaJuridica> listaPj = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Individual or company (i/c)? ");
			char resposta = sc.nextLine().charAt(0);
			
			if(resposta == 'i') {
				System.out.print("Name: ");
				String nome = sc.nextLine();
				System.out.print("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double gastoSaude = sc.nextDouble();
				sc.nextLine();
				
				listaPf.add(new PessoaFisica(nome, rendaAnual, gastoSaude)); 
			}
			else if(resposta == 'c') {
				System.out.print("Name: ");
				String nome = sc.nextLine();
				System.out.print("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Number of employees: ");
				Integer numeroFuncionarios = sc.nextInt();
				sc.nextLine();
				
				listaPj.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
			else {
				System.out.println("Invalid"); 
				i--;
			}
		}
		System.out.println();
		Double total = 0.0;
		
		for(PessoaFisica pf : listaPf) {
			System.out.print("TOTAL INDIVIDUAL TAXES: ");
			System.out.println(pf);
			total += pf.totalTax();
		}
		System.out.println();
		
		for(PessoaJuridica pj : listaPj) {
			System.out.print("TOTAL COMPANY TAXES: ");
			System.out.println(pj);	
			total += pj.totalTax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: " + total);
		sc.close();
	}
}
