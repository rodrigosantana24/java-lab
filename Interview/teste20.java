import java.util.Scanner;

public class teste20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que deseja visualizar a tabuada: ");
        int num = sc.nextInt();

        tabuada(num);
        sc.close();
    }

    public static void tabuada(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }

}
