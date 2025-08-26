package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Main {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		System.out.println("Digite o diretório da pasta: ");
		String sourceFile = sc.nextLine();
		
		File file = new File(sourceFile);
		String sourceFolder = file.getParent();
		boolean sucess = new File(sourceFolder + "/out").mkdir();
		
		String targetFile = sourceFolder + "/out/summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
				for(Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFile + "Criado");
			}
			catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("error: " + e.getMessage());
		}
		
		System.out.println(sucess);
		sc.close();
	}
}
