import java.util.Scanner;

class Teste {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		int soma = 0;
		
		for(int i=1; i<=n; i++){
			if(i%2 == 0){
				soma += i;
			}
		}
		
		System.out.println("A soma dos números pares de 1 até " + n + " é: " + soma);
		sc.close();
	}
	
}