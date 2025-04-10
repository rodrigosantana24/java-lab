package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			numeros[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores =");
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("  %.1f", numeros[i]);
		}
		
		System.out.println();
		System.out.print("Soma = ");
		double soma = 0;
		for (int i=0; i<numeros.length; i++) {
			soma += numeros[i];
		}
		System.out.printf(" %.2f", soma);
		
		System.out.println();
		System.out.print("Média = ");
		double media = 0;
		for (int i=0; i<numeros.length; i++) {
			media += numeros[i];
		}
		System.out.printf(" %.2f", (media/numeros.length));
			
		sc.close();
	}

}