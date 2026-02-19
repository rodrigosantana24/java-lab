import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args){
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.50));
        lista.add(new Product("HD Case", 80.90));

        lista.forEach(new PriceUpdate());

        lista.forEach(System.out::println);

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };

        lista.forEach(cons);
    }
}

class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
