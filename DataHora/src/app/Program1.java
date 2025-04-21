package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

	public static void main(String[] args) {
		/* 
		 Documentação que contém todos os comandos de formatação de Data, hora, fuso horário
		 https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 */
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-04-21"); 
		LocalDateTime d05 = LocalDateTime.parse("2025-04-21T11:10:20"); 
		Instant d06 = Instant.parse("2025-04-21T11:10:20Z");
		Instant d07 = Instant.parse("2025-04-21T11:10:20-03:00");  // Horário de Londres
		
		// Texto em formato customizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");   // Dia, mês, ano
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  // Horas de 0-23, minutos
		LocalDate d08 = LocalDate.parse("21/04/2025", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("21/04/2025 11:26", fmt2);
		
		LocalDate d10 = LocalDate.of(2025, 4, 21);
		LocalDateTime d11 = LocalDateTime.of(2025, 4, 21, 11, 33);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);

	}

}
