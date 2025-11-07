import java.util.Scanner;
import java.util.ArrayList;

public class teste16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank banco = new Bank();

        int response = -1;

        while(response != 0){
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Listar Contas");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            response = sc.nextInt();
            sc.nextLine(); // LIMPA O BUFFER

            switch(response) {
                case 1 -> {
                    System.out.println("\n** Criar nova conta **");
                    System.out.print("Nome do titular: ");
                    String titular = sc.nextLine();
                    banco.criarConta(titular);
                }

                case 2 -> {
                    System.out.println("\n** Depositar **");
                    System.out.print("Nome do titular: ");
                    String titular = sc.nextLine();
                    BankAccount conta = banco.buscarConta(titular);

                    if(conta != null){
                        System.out.print("Valor para depósito: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        conta.depositar(valor);
                    }
                }

                case 3 -> {
                    System.out.println("\n** Sacar **");
                    System.out.print("Nome do titular: ");
                    String titular = sc.nextLine();
                    BankAccount conta = banco.buscarConta(titular);

                    if(conta != null){
                        System.out.print("Valor para saque: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        conta.sacar(valor);
                    }
                }

                case 4 -> banco.listarContas();

                case 0 -> System.out.println("Encerrando o programa...");

                default -> System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}

class BankAccount {
    private String titular;
    private double saldo;

    public BankAccount(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
        } else if(valor <= 0){
            System.out.println("Valor inválido.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado!");
        }
    }

    @Override
    public String toString(){
        return "Titular: " + titular + " — Saldo: R$ " + saldo;
    }
}

class Bank {
    private ArrayList<BankAccount> contas = new ArrayList<>();

    public void criarConta(String titular){

        if(buscarConta(titular) != null){
            System.out.println("Já existe uma conta com esse titular.");
            return;
        }

        contas.add(new BankAccount(titular));
        System.out.println("Conta criada com sucesso!");
    }

    public BankAccount buscarConta(String titular){
        for(BankAccount conta : contas){
            if(conta.getTitular().equalsIgnoreCase(titular)){
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public void listarContas(){
        if(contas.isEmpty()){
            System.out.println("Nenhuma conta cadastrada.");
        }
        for(BankAccount conta : contas){
            System.out.println(conta);
        }
    }
}
