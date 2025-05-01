package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(sc.next());
		
		Client client1 = new Client(name, email, birthdate);
		
		System.out.println("Digite o status do pedido: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client1);
		
		System.out.println();
		
		System.out.print("Quantos itens para este pedido? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Digite os dados do #" + i + " item: ");
			System.out.print("Nome do produto: ");
			String productName = sc.nextLine();
			System.out.print("Preço do produto: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer productQuantity = sc.nextInt();
			System.out.println();
			
			Product produto1 = new Product(productName, productPrice);
			OrderItem item = new OrderItem(productQuantity, productPrice, produto1);
			
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println(order);
		sc.close();
	}

}
