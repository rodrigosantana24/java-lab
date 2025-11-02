import java.util.Scanner;
import java.util.ArrayList;

class Teste8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        int somaPares = 0, somaImpares = 0;
        for (int p : pares) somaPares += p;
        for (int i : impares) somaImpares += i;

        System.out.println("\nQuantidade de números pares: " + pares.size());
        System.out.println("Quantidade de números ímpares: " + impares.size());

        if (pares.size() > 0) {
            double mediaPares = (double) somaPares / pares.size();
            System.out.println("Média dos números pares: " + mediaPares);
        } else {
            System.out.println("Nenhum número par informado.");
        }

        if (impares.size() > 0) {
            double mediaImpares = (double) somaImpares / impares.size();
            System.out.println("Média dos números ímpares: " + mediaImpares);
        } else {
            System.out.println("Nenhum número ímpar informado.");
        }

        sc.close();
    }
}
