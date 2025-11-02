import java.util.Scanner;
import java.util.ArrayList;

class Teste7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[] palavras = new String[5];
		ArrayList<String> quatroLetras = new ArrayList<>(); 
		
		for(int i=0; i<palavras.length; i++){
			System.out.print("Digite a palavra n° "+ (i+1) + ": ");
            String palavra = sc.nextLine();
			palavras[i] = palavra;

            if(palavra.length() > 4){
				quatroLetras.add(palavra);
			}
		}
		
		System.out.println("Palavras com mais de 4 letras: ");
		for (String palavra : quatroLetras) {
            System.out.println(palavra);
        }
		sc.close();
	}
}