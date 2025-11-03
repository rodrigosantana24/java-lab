import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class teste9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();
        char[] caracteres = frase.toCharArray();

        List<Character> limpos = limpaCaractere(caracteres);
        System.out.println("Total de letras: " + limpos.size());

        String result = contaVogais(limpos);
        System.out.println(result);


        sc.close();
    }

    public static List<Character> limpaCaractere(char[] caracteres){
        ArrayList<Character> caracteresLimpo = new ArrayList<>();
        for(char carac : caracteres ){
            if(Character.isLetter(carac)){
                caracteresLimpo.add(carac);
            }
        }
        return caracteresLimpo;
    }

    public static String contaVogais(List<Character> caracteres){
        int a=0, e=0, i=0, o=0, u=0;
        for(char carac : caracteres){
            switch(carac){
                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> i++;
                case 'o' -> o++;
                case 'u' -> u++;
            }
        }
        return "Quantidade de 'a': " + a + "\n" +
                "Quantidade de 'e': " + e + "\n" +
                "Quantidade de 'i': " + i + "\n" +
                "Quantidade de 'o': " + o + "\n" +
                "Quantidade de 'u': " + u;
    }
}
