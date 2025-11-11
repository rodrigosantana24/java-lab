import java.util.ArrayList;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(2);
        numeros.add(15);
        numeros.add(1);

        System.out.println(bubbleSort(numeros));

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> numeros){
        for(int i=0; i<numeros.size() - 1; i++){

            for(int j=0; j<numeros.size() - 1 - i; j++){

                if(numeros.get(j) > numeros.get(j+1)){

                    int temporario = numeros.get(j);
                    numeros.set(j, numeros.get(j+1));
                    numeros.set(j+1, temporario);

                }
            }
        }

        return numeros;
    }
}
