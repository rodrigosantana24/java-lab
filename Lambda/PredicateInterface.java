import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args){
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.50));
        lista.add(new Product("HD Case", 80.90));

        lista.removeIf(new ProductPredicate());
        lista.removeIf(Product::staticProductPredicate);
        lista.removeIf(Product::nonStaticProductPredicate);
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;

        lista.removeIf(p -> p.getPrice() >= 100.0);

        for(Product p : lista){
            System.out.println(p);
        }
    }
}

class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
