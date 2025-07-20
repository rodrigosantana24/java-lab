package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\texto.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("O bloco finally executou.");
		}
	}
}
