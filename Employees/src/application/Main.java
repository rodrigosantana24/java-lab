package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Digite o número de funcionários: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do funcionário #" + i + ":");
			System.out.print("O funcionário é terceirizado (y/n)? ");
			char response = sc.nextLine().charAt(0);
			
			if(response == 'n') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Horas trabalhadas: ");
				Integer hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Valor por hora: ");
				Double valuePerHour = sc.nextDouble();
				sc.nextLine();
				
				Employee emp = new Employee(name, hours, valuePerHour);
				employees.add(emp);
			}
			
			if(response == 'y') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Horas trabalhadas: ");
				Integer hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Valor por hora: ");
				Double valuePerHour = sc.nextDouble();
				sc.nextLine();
				System.out.print("Valor adicional: ");
				Double additionalCharge = sc.nextDouble();
				sc.nextLine();
				
				OutSourcedEmployee ose = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(ose);
			}
		}
		System.out.println("Pagamentos:");
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		sc.close();
	}

}
