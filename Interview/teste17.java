import java.util.Scanner;

class Bissexto{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        ehBissexto(ano);
        sc.close();
    }

    public static void ehBissexto(int ano){
        if(ano % 4 == 0 || (ano % 100 == 0 && ano % 400 == 0)){
            System.out.println(ano + " é um ano bissexto!");
        } else {
            System.out.println(ano + " não é um ano bissexto!");
        }
    }
}