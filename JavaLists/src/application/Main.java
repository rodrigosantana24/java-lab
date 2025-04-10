package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// List<Integer> example;  A lista não aceita tipos primitivos, int, double etc
		
		List<String> list = new ArrayList<>();
		
		list.add("Rodrigo");
		list.add("Lays");
		list.add("Sousa");
		list.add("Lima");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		System.out.println("-----------------");
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		// Encontrando o primeiro elemento que contém a primeira letra A
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
		System.out.println(name2);
		
		
		
		System.out.println("-----------------");
		
		// Mostrando o index
		System.out.println("Index of Lima: " + list.indexOf("Lima"));  // Retorna -1 quando não encontra o elemento
		
		System.out.println("-----------------");
		list.removeIf(x -> x.charAt(0) == 'M');  // Remove elementos que inicia com a letra M  ( Expressão lambda )

		for (String x : list) {
			System.out.println(x);
		}	
		System.out.println("-----------------");
		
		// Filtrar a lista deixando somente quem tem nome com inicial 'R'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}	
		System.out.println("-----------------");
		
		
		list.remove(2);
		list.remove("Rodrigo");
		
		for (String x : list) {
			System.out.println(x);
		}	
		
		System.out.println("-----------------");
	}

}
