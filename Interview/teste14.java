import java.util.Scanner;
import java.util.Arrays;

public class teste14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja digitar? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite o n° " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(filtrarPares(numbers)));
        sc.close();
    }

    public static int[] filtrarPares(int[] numbers){
        int count=0;

        for(int num : numbers){
            if(num % 2 == 0){
                count++;
            }
        }

        int[] numerosPares = new int[count];
        int index = 0;

        for(int num : numbers){
            if(num % 2 == 0){
                numerosPares[index] = num;
                index++;
            }
        }
        return numerosPares;
    }
}
