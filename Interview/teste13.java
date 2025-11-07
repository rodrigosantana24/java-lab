import java.util.Scanner;
import java.util.Arrays;

class teste13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

       System.out.println(invertePalavras(frase));
        sc.close();
    }

    public static String invertePalavras(String frase){
        String[] palavras = frase.trim().split("\\s+"); // Tirando os possiveis espaços
        String[] palavrasInvertidas = new String[palavras.length];

        for(int i=0; i<palavras.length; i++){
            char[] palavraAtual = palavras[i].toCharArray(); // ex: "c" [0], "é" [1], "u" [2]
            String palavraInvertida = "";

            for(int j=(palavraAtual.length - 1); j>=0; j--){
                palavraInvertida += palavraAtual[j];
            }

            palavrasInvertidas[i] = palavraInvertida;
        }

        return Arrays.toString(palavrasInvertidas);
    }
}