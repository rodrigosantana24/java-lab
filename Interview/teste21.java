import java.util.Scanner;

public class teste21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int[] numeros = new int[num];

        for(int i=0; i<numeros.length; i++){
            numeros[i] = i+1;
        }

        analisaMultiplos(numeros);
    }

    public static void analisaMultiplos(int[] numeros){
        for(int num : numeros){
            if(num % 3 == 0 && num % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(num % 3 == 0){
                System.out.println("Fizz");
            } else if(num % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}