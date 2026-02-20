import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class teste28 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        IO.print("Digite o diretório do arquivo: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> list = new ArrayList<>();
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                line = br.readLine();
            }

            double average = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x+y) / list.size();

            IO.println("Preço médio: " + String.format("%.2f", average));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < average)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .toList();

            names.forEach(IO::println);

        } catch(IOException e){
            IO.println("Error: " + e.getMessage());
        }

    }
}
