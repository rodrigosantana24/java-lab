import java.util.Scanner;
import java.util.ArrayList;

class teste11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Saída: " + inverteFrase(frase));
        sc.close();
    }

    public static String inverteFrase(String frase){
        String[] palavras = frase.split(" "); //separa a frase entre os espaços.
        int tam = palavras.length;
        ArrayList<String> fraseInvertida = new ArrayList<>();

        for(int i=tam-1; i>=0; i--){
            fraseInvertida.add(palavras[i]);
        }
        return String.join(" ", fraseInvertida);
    }
}