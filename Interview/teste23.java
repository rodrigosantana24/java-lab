import java.util.Scanner;

public class teste23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int response = -1;
        double saldo = 0.0;

        while(response != 4){
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Digite a operação: ");
            response = sc.nextInt();

            switch(response) {
                case 1 -> {
                    System.out.println("Saldo atual: " + saldo);
                }

                case 2 -> {
                    System.out.print("Valor do deposito: ");
                    double valor = sc.nextDouble();
                    saldo += valor;
                    System.out.println("Deposito efetuado com sucesso!");
                }

                case 3 -> {
                    System.out.print("Valor do saque: ");
                    double valor = sc.nextDouble();
                    if(valor <= saldo){
                        saldo -= valor;
                        System.out.println("Saque efetuado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                }

                case 4 -> {
                    System.out.println("Encerrando programa...");
                    response = 4;
                }

                default -> System.out.println("Operação inválida");
            }
        }

        sc.close();
    }


}
