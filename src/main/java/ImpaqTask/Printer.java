package ImpaqTask;

import java.util.ArrayList;

public class Printer {
    private ArrayList<Product> products;

    public Printer() {
        products = new ArrayList<>();
    }
    public void addProductToPrinter(Product product) {
        products.add(product);
    }
    public void printReceipe() {
        for(Product product: products) {
            product.display();
        }
    }
}
