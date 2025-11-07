public class teste15 {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Rodrigo");
        conta.depositar(500);
        conta.sacar(200);

        System.out.println(conta.getSaldo());
        System.out.println(conta);

    }
}

class ContaBancaria{
    private String titular;
    private double saldo;

    public ContaBancaria(){
    }

    public ContaBancaria(String titular){
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
            System.out.println("Deposito efetuado com sucesso");
        } else {
            System.out.println("Erro ao depositar.");
        }
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString(){
        return "Titular: " + getTitular() +
                ", Saldo: " + getSaldo();
    }
}
