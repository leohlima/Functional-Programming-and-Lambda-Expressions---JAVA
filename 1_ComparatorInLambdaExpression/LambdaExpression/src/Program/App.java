package Program;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Tv", 200.0));
        productList.add(new Product("Notebook", 300.0));
        productList.add(new Product("Tablet", 90.0));

        //Lambda expression used as "Comparator";
        productList.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        //Lambda expression used as "Predicate";
        productList.removeIf(p -> p.getPrice() <= 100);

        //Lambda expression used as "Consumer";

        for (Product p : productList){
            System.out.println(p);
        }

    }
}
