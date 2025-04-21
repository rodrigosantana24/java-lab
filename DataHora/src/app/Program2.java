package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		/* 
		 Documentação que contém todos os comandos de formatação de Data, hora, fuso horário:
		 https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 
		 Comando ISO_DATE_TIME
		 '2011-12-03T10:15:30+01:00[Europe/Paris]'
		 */
		
		LocalDate d01 = LocalDate.parse("2025-04-21"); 
		LocalDateTime d02 = LocalDateTime.parse("2025-04-21T11:10:20"); 
		Instant d03 = Instant.parse("2025-04-21T11:10:20Z"); // Horário de Londres

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());  
		// withzone específica o fuso horário do computador do usuário
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; 
		// Formato padrão Data, Hora
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		// Formato padrao Data, Hora, Fuso Horario
		//
		
		System.out.println("d01 = " + d01.format(fmt1));  // A saída será a data formatada
		System.out.println("d02 = " + d02.format(fmt2));
		
		System.out.println("d03 = " + fmt3.format(d03));
		
		System.out.println("d02 = " + fmt4.format(d02));
		System.out.println("d03 = " + fmt5.format(d03));

	}

}
