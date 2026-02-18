import java.util.*;

public class SetInterface {
    public static void main(String[] args){
        Set<String> set = new HashSet<>(); // Quando ordem não importa
        Set<String> set2 = new TreeSet<>();
        Set<String> set3 = new LinkedHashSet<>();

        System.out.println("-----------------------");

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.length() >= 3); // Predicado

        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);
        }

        System.out.println("-----------------------");

        set2.add("TV");
        set2.add("Tablet");
        set2.add("Notebook");

        System.out.println(set2.contains("Notebook"));

        for(String p : set2){
            System.out.println(p);
        }

        System.out.println("-----------------------");

        set3.add("TV");
        set3.add("Tablet");
        set3.add("Notebook");

        System.out.println(set3.contains("Notebook"));

        for(String p : set3){
            System.out.println(p);
        }

        System.out.println("-----------------------");

        //Conjuntos com SET
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //União
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Interseção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
