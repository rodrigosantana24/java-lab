import java.util.Scanner;
import java.util.ArrayList;

class teste19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int response = -1;

        System.out.println("====== CRUD ======");
        System.out.println("1 - ADICIONAR NOME");
        System.out.println("2 - REMOVER NOME");
        System.out.println("3 - LISTAR NOMES");
        System.out.println("0 - SAIR");

        while(response != 0){
            System.out.print("Escolha uma opção: ");
            response = sc.nextInt();
            sc.nextLine();

            switch(response){
                case 1 -> {
                    System.out.print("Escreva o nome que deseja adicionar: ");
                    nomes.add(sc.nextLine().toLowerCase());
                }

                case 2 -> {
                    System.out.print("Escreva o nome que deseja remover: ");
                    String nome = sc.nextLine().toLowerCase();
                    if(nomes.contains(nome)){
                        nomes.remove(nome);
                        System.out.println("Nome removido com sucesso!");
                    } else {
                        System.out.println("Nome não encontrado");
                    }
                }

                case 3 -> {
                    for(String nome : nomes){
                        System.out.println(nome);
                    }
                    System.out.println("Total de " + nomes.size() + " cadastros.");
                }

                case 0 -> {
                    System.out.println("Encerrando programa...");
                }

                default -> {
                    System.out.println("Número inválido");
                }
            }
        }

        sc.close();
    }

    public static int somaPares(int[] numeros){
        int pares = 0;
        for(int num : numeros){
            if(num % 2 == 0){
                pares += num;
            }
        }

        return pares;
    }

    public static String maiorMenor(int[] numeros){
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        for(int num : numeros){
            if(num < menor){
                menor = num;
            } else if (num > maior) {
                maior = num;
            }
        }

        return "Maior: " + maior + ", Menor: " + menor;
    }

    public static boolean Palindromo(String palavra){
        char[] letras = palavra.toCharArray();
        int tamanho = palavra.length();

        for(int i=0; i<tamanho; i++){
            if(letras[i] != letras[tamanho - 1 -i]){
                return false;
            }
        }
        return true;
    }

    public static String ocorrenciaCaractere(String palavra, char caractere){
        char[] letras = palavra.toCharArray();
        int count = 0;

        for(char letra : letras){
            if(letra == caractere){
                count++;
            }
        }

        return "O caractere " + caractere + " apareceu " + count + " vezes.";
    }
}