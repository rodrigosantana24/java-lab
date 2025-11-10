import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class teste18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        banco.carregarContasDoArquivo(); // carrega dados ao iniciar

        int opcao;

        do {
            System.out.println("\n=== BANCO JAVA ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Listar Contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do titular: ");
                    String nome = sc.nextLine();
                    banco.criarConta(nome);
                    banco.salvarContasNoArquivo();
                    break;

                case 2:
                    System.out.print("Titular para depósito: ");
                    String nomeDep = sc.nextLine();
                    ContaBanco c1 = banco.buscarConta(nomeDep);
                    if (c1 != null) {
                        System.out.print("Valor: ");
                        c1.depositar(sc.nextDouble());
                        banco.salvarContasNoArquivo();
                    }
                    break;

                case 3:
                    System.out.print("Titular para saque: ");
                    String nomeSaq = sc.nextLine();
                    ContaBanco c2 = banco.buscarConta(nomeSaq);
                    if (c2 != null) {
                        System.out.print("Valor: ");
                        c2.sacar(sc.nextDouble());
                        banco.salvarContasNoArquivo();
                    }
                    break;

                case 4:
                    banco.listarContas();
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}

class ContaBanco {
    private String titular;
    private Double saldo;

    public ContaBanco(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public ContaBanco(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return titular + ";" + saldo;
    }
}

class Banco {
    private ArrayList<ContaBanco> contas = new ArrayList<>();

    public void criarConta(String titular) {
        contas.add(new ContaBanco(titular));
        System.out.println("Conta criada com sucesso!");
    }

    public ContaBanco buscarConta(String titular) {
        for (ContaBanco conta : contas) {
            if (conta.getTitular().equals(titular)) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public void listarContas() {
        System.out.println("\n=== CONTAS CADASTRADAS ===");
        for (ContaBanco conta : contas) {
            System.out.println("Titular: " + conta.getTitular() + "  | Saldo: R$ " + conta.getSaldo());
        }
    }

    public void salvarContasNoArquivo() {
        try {
            FileWriter writer = new FileWriter("contas.txt");

            for (ContaBanco conta : contas) {
                writer.write(conta.toString() + "\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }

    public void carregarContasDoArquivo() {
        try {
            File file = new File("contas.txt");
            if (!file.exists()) return;

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String linha;

            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                contas.add(new ContaBanco(partes[0], Double.parseDouble(partes[1])));
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivo.");
        }
    }
}
