import java.util.ArrayList;

public class ComparatorInterface {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort( (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p : list){
            System.out.println(p);
        }
    }
}

class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(){}

    public Product (String name, Double price){
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
    public String toString(){
        return "Produto [name=" + name + ", price=" + price +"]";
    }

    @Override
    public int compareTo(Product p) {
        return name.toUpperCase().compareTo(p.getName().toUpperCase());
    }
}
