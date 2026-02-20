import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args){
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.50));
        lista.add(new Product("HD Case", 80.90));

        List<String> names = lista.stream().map(new UpperCaseName()).toList();

        names.forEach(System.out::println);
    }
}

class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
