package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Products;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Products> produtos = new ArrayList<>();
		
		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do produto #" + i);
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char response = sc.nextLine().charAt(0);
			
			if(response == 'c') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preço: ");
				Double price = sc.nextDouble();
				Products prod = new Products(name, price);
				produtos.add(prod);
			}
			else if(response == 'u') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preço: ");
				Double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Data: ");
				String date = sc.nextLine();
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate manufactureDate = LocalDate.parse(date, dtf);
				Products uprod = new UsedProduct(name, price, manufactureDate);
				produtos.add(uprod);
			}
			else if(response == 'i') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preço: ");
				Double price = sc.nextDouble();
				System.out.print("Taxa: ");
				Double customsFee = sc.nextDouble();
				sc.nextLine();
				Products iprod = new ImportedProduct(name, price, customsFee);
				produtos.add(iprod);
			}
			
		}
		for(Products prod : produtos) {
			System.out.println(prod.priceTag());
		}
		
		
	
		sc.close();
	}
}
