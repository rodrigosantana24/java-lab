import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class MapInterface {
    public static void main(String[] args){
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99999999");

        cookies.remove("email");
        cookies.put("phone", "111111111");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));

        System.out.println("ALL COOKIES: ");

        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("Tamanho do map: " + cookies.size());

        System.out.println("----------------------------------");

        Map<Product, Double> cookies2 = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        cookies2.put(p1, 100000.0);
        cookies2.put(p2, 200000.0);
        cookies2.put(p3, 150000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + cookies2.containsKey(ps));

    }
}

class Product{
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
