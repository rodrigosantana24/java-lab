package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comments;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("Tenha uma ótima viagem!");
		Comments c2 = new Comments("Uau! isso é ótimo!");
		Post p1 = new Post(
				sdf.parse("28/04/2025 11:09:22"),
				"Viajando para Nova Zelândia",
				"Estou indo visitar esse incrível país!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comments c3 = new Comments("Boa noite!");
		Comments c4 = new Comments("Espero que esteja tudo bem com você");
		Post p2 = new Post(
				sdf.parse("29/04/2025 19:09:22"),
				"Boa noite, galera!",
				"Vejo você amanhã",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
	}

}
