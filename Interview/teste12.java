import java.util.Scanner;

class teste12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Saída: " + inverteLetras(frase));
        sc.close();
    }

    public static String inverteLetras(String frase) {
        String[] palavras = frase.trim().split("\\s+");
        String[] palavrasInvertidas = new String[palavras.length];

        for (int i = 0; i < palavras.length; i++) {
            char[] palavraAtual = palavras[i].toCharArray();
            int tam = palavraAtual.length;

            StringBuilder sb = new StringBuilder();
            for (int j = tam - 1; j >= 0; j--) {
                sb.append(palavraAtual[j]);
            }

            palavrasInvertidas[i] = sb.toString();
        }
        return String.join(" ", palavrasInvertidas);
    }
}
