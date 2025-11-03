import java.util.Scanner;

class teste4 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a palavra: ");
		String palavra = sc.nextLine();
		
		boolean result = Palindromo(palavra);
		
		if(result){
			System.out.println("A palavra " + palavra + " é um palindromo.");
		}
		else{
			System.out.println("A palavra " + palavra + " não é um palindromo.");
		}
		
		sc.close();
    }
    
    public static boolean Palindromo(String palavra){
        char[] letras = palavra.toCharArray();
		int tamanho = palavra.length();
		
		for(int i=0; i<tamanho; i++){
			if(letras[i] != letras[tamanho - 1 -i]){
				return false;
			}
		}	
		return true;
    }
        
}
