package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> funcionarios = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Funcionário #" + (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salário ");
			Double salario = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salario);
			funcionarios.add(emp);
		}
		
		System.out.print("Digite o ID do funcionário que irá receber um aumento salarial: ");
		int id = sc.nextInt();
		
		Integer pos = position(funcionarios, id);
		
		if (pos == null) {
			System.out.println("Esse ID não existe!");
		}
		
		else {
			System.out.print("Digite a porcentagem: ");
			double percentage = sc.nextDouble();
			funcionarios.get(pos).salaryIncrease(percentage);
		}
			
		for (Employees emp : funcionarios) {
			System.out.println(emp);
		}
		
		sc.close();
		}
		
		public static Integer position(List<Employees> list, int id) {
			for (int i=0; i<list.size(); i++) {
				if (list.get(i).getId() == id) {     // Se o elemento da posição i, se o id do elemento i for igual a "id", então retorna i
					return i;
				}
			}
			return null;
		}
	
	
	}

