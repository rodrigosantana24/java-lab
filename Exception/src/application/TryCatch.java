package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		method2();
		System.out.println("Fim do programa.");
	}
	
	public static void method1() {
		System.out.println("***MÉTODO 1 INICIADO!***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Valor inválido!");
		}
		
		System.out.println("***MÉTODO 1 FINALIZADO!***");
		sc.close();
	}
	
	public static void method2() {
		System.out.println("***MÉTODO 2 INICIADO!***");
		method1();
		System.out.println("***MÉTODO 2 FINALIZADO!***");
	}

}
