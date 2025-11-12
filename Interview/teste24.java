import java.util.ArrayList;
import java.util.Scanner;

class teste24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros.add(sc.nextInt());
        }
        System.out.println("Antes: " + numeros);
        ordenaCrescente(numeros);
        System.out.println("Ordenado: " + numeros);
        ordenaDecrescente(numeros);
        System.out.println("Decrescente: " + numeros);
        maiorMenorMedia(numeros);
    }

    public static void ordenaCrescente(ArrayList<Integer> numeros){
        for(int i=0; i<numeros.size(); i++){
            for(int j=0; j<numeros.size() - 1 - i; j++){
                if(numeros.get(j) > numeros.get(j+1)){
                    int temporario = numeros.get(j);
                    numeros.set(j, numeros.get(j+1));
                    numeros.set(j+1, temporario);
                }
            }
        }
    }

    public static void ordenaDecrescente(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = 0; j < numeros.size() - 1 - i; j++) {
                if (numeros.get(j) < numeros.get(j + 1)) {
                    int temporario = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, temporario);
                }
            }

        }
    }

    public static void maiorMenorMedia(ArrayList<Integer> numeros){
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double soma = 0.0;

        for(int num : numeros){
            if(num > maior){
                maior = num;
            }

            if(num < menor){
                menor = num;
            }

            soma += num;
        }

        System.out.println("Maior: " + maior + ", Menor: " + menor + ", Média: " + (soma / numeros.size()));
    }
}