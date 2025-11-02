import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		
		for(int i=0; i<numeros.length; i++){
			System.out.print("Digite o número: ");
			numeros[i] = sc.nextInt();
		}
		
		for(int j=numeros.length-1; j>=0; j--){
			System.out.println(numeros[j] + " ");
		}
		sc.close();
	}
	
}