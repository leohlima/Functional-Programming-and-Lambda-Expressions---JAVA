package services;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> productList, Predicate<Product> criterio){
        double sum = 0;
        for (Product p : productList){
            if (criterio.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
