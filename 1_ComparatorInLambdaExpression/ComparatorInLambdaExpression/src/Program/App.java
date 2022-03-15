package Program;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Tv", 300.0));
        productList.add(new Product("Notebook", 400.0));
        productList.add(new Product("Tablet", 600.0));

        productList.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : productList){
            System.out.println(p);
        }

    }
}
