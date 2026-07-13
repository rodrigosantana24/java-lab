import java.util.Scanner;

public class IfForWhileSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        String logExtrato = "";
        int quantidadeOperacoes = 0;

        while (true) {
            System.out.println("====================");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Extrato");
            System.out.println("5 - Contar operações");
            System.out.println("0 - Sair");
            System.out.println("====================");
            System.out.print("Selecione: ");

            int escolha = sc.nextInt();

            switch (escolha) {

                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:

                    System.out.print("Valor depósito: ");
                    double valorDeposito = sc.nextDouble();

                    if (valorDeposito <= 0) {
                        System.out.println("Valor inválido.");
                    } else {
                        saldo += valorDeposito;
                        quantidadeOperacoes++;
                        logExtrato += quantidadeOperacoes +
                                " - Depósito: R$ " + valorDeposito + "\n";
                        System.out.println("Depósito realizado.");
                    }

                    break;

                case 3:

                    System.out.print("Valor saque: ");
                    double valorSaque = sc.nextDouble();

                    if (valorSaque <= 0) {
                        System.out.println("Valor inválido.");
                    } else if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        quantidadeOperacoes++;
                        logExtrato += quantidadeOperacoes +
                                " - Saque: R$ " + valorSaque + "\n";
                        System.out.println("Saque realizado.");
                    }

                    break;

                case 4:

                    if (quantidadeOperacoes == 0) {
                        System.out.println("Nenhuma operação registrada.");
                    } else {
                        System.out.println("===== EXTRATO =====");
                        System.out.print(logExtrato);
                    }

                    break;

                case 5:

                    int contador = 0;

                    for (int i = 0; i < logExtrato.length(); i++) {
                        if (logExtrato.charAt(i) == '\n') {
                            contador++;
                        }
                    }

                    System.out.println("Operações realizadas: " + contador);

                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}