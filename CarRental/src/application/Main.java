package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		
		System.out.println("Retirada (dd/MM/yyy hh:MM): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.println("Retorno (dd/MM/yyy hh:MM): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel)); 
		sc.close();
	}

}
