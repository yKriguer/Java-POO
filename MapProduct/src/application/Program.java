package application;

import entities.Product;

import java.util.LinkedHashMap;
import java.util.Map;


public class Program {
    public static void main(String[] args) {
        Map<Product, Double> stock = new LinkedHashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);
        Product p4 = new Product("TV", 900.0);

        stock.put(p1, 100.0);
        stock.put(p2, 200.0);
        stock.put(p3, 50.0);
        stock.put(p4, 300.0);

        for (Product key : stock.keySet()) {
            System.out.println(key + ", Quantity: " + stock.get(key));
        }

        Product ps = new Product("TV", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
