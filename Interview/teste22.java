import java.util.Scanner;

public class teste22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i=0; i< numeros.length; i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        maiorMenor(numeros);

        sc.close();
    }

    public static void maiorMenor(int[] numeros){
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double media = 0.0;

        for(int num : numeros){
            if(num > maior){
                maior = num;
            }

            if(num < menor){
                menor = num;
            }

            media += num;
        }

        System.out.println("Maior número: " + maior + ", Menor número: " + menor + ", Média: " + (media/numeros.length));
    }
}
