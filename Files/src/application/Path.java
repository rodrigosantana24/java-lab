package application;

import java.io.File;
import java.util.Scanner;

public class Path {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o diretório da pasta: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\Pasta").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucess);
		
		sc.close();
	}
}
