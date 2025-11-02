import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Teste3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		
		int menor = Integer.MAX_VALUE;
		int maior = 0;
		
		for(int i=1; i<=5; i++){
            System.out.print("Digite o número " + i + ": ");
			int n = sc.nextInt();
			numeros.add(n);
			
			if(n<menor){
				menor = n;
			}
			else if (n>maior) {
				maior = n;
			}
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		sc.close();
    }
}
