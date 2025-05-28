package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Battery;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> eventos = new ArrayList<>();
		
		System.out.println();
		int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			Integer processos = sc.nextInt();
			eventos.add(processos);
		}
		
		Battery battery = new Battery(eventos);
		System.out.println(battery.getBattery());
		
		sc.close();
	}

}
