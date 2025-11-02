import java.util.Scanner;

class Teste5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número: ");
		int num = sc.nextInt();
		
		boolean result = ehPrimo(num);
		if(result == true){
			System.out.println("É primo.");
		} 
		else {
			System.out.println("Não é primo.");
		}
        sc.close();
	}
	
	public static boolean ehPrimo(Integer num) {
		if(num <= 1) return false;
		
		for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
	}
}