import java.util.Scanner;

public class VarTypeOps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.print("Percentual INSS: ");
        double descontoInss = sc.nextDouble();

        System.out.print("Percentual IR: ");
        double descontoIr = sc.nextDouble();

        System.out.println("===================================");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + salario);
        System.out.println("INSS: " + (descontoInss / 100 * salario));
        System.out.println("IR: " + (descontoIr / 100 * salario));
        System.out.println("Total de descontos: " + ((descontoInss / 100 * salario) + (descontoIr / 100 * salario)));
        System.out.println("Salário Líquido: " + (salario - ((descontoInss / 100 * salario) + (descontoIr / 100 * salario))));
        System.out.println("===================================");

        sc.close();
    }
}
