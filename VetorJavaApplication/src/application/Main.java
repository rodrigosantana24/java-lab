package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão cadastradas? ");
		int qtde = sc.nextInt();
		
		Pessoas[] pessoa = new Pessoas[qtde];
		
		//Cadastrando pessoas
		for (int i=0; i<pessoa.length; i++) {
			System.out.println("Dados da " + (i+1) + "° pessoa: ");
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoa[i] = new Pessoas(nome, idade, altura);
		}
		
		//Calculando a altura média das pessoas
		double alturas = 0;
		for (int i=0; i<pessoa.length; i++) {
			alturas += pessoa[i].getAltura();
		}
		
		double media = alturas / pessoa.length;
		
		//Analisando é menor de 18 anos
		int menores_de_idade = 0;
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 18) {
				menores_de_idade++;
			}
		}
		
		double porcentagem = (double) menores_de_idade / pessoa.length * 100;
		
		//Mostrando resultados
		System.out.println();
		System.out.printf("Altura média: %.2f", media);
		System.out.println();
		System.out.printf("Pessoas menores de idade: %.1f", porcentagem);
		System.out.println();
		
		System.out.println();
		System.out.println("Nome dos menores de idade: ");
		System.out.println();
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 18) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		sc.close();
	}

}
