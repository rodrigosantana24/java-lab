import java.util.Scanner;

class Teste2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a palavra: ");
		String palavra = sc.nextLine().toLowerCase();
		int qtdVogais = 0;
		
		for(char letra : palavra.toCharArray()){
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
				qtdVogais ++;
			}
		}
		
		System.out.println("A palavra '" + palavra + "' contém " + qtdVogais + " vogais.");
		sc.close();
	}
}