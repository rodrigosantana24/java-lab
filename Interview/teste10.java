import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class teste10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja digitar? ");
        int n = sc.nextInt();
        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i=1; i<=n; i++){
            System.out.print("Digite o número " + i + ": ");
            int num = sc.nextInt();
            numeros.add(num);
        }
        System.out.println(numerosUnicos(numeros));
        sc.close();
    }

    public static ArrayList<Integer> numerosUnicos(ArrayList<Integer> numeros){
        ArrayList<Integer> numerosUnicos = new ArrayList<>();
        for(int i=0; i<numeros.size(); i++){
            for(int j=1; j<numeros.size(); j++){
                if(Objects.equals(numeros.get(i), numeros.get(j))){
                    System.out.println("Os números " + numeros.get(i) + " e " + numeros.get(j) + " são iguais.");
                    j++;
                }
                else {
                    System.out.println("Os números " + numeros.get(i) + " e " + numeros.get(j) + " não são iguais.");
                    numerosUnicos.add(numeros.get(j));
                }
            }
        }
        return numerosUnicos;
    }
}
