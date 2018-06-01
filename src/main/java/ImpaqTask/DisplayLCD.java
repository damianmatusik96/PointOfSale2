package ImpaqTask;

import java.util.ArrayList;

public class DisplayLCD implements DisplayOnLCD {
    private ArrayList<Product> products;
    private double lcdTotalPrice;

    public DisplayLCD() {
        this.lcdTotalPrice = 0;
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public double getTotalPrice() {
        for(Product product: products) {
            lcdTotalPrice += product.getPrice();
        }
        return lcdTotalPrice;
    }
    @Override
    public void display() {
        for(Product product: products) {
            product.display();
        }
    }
}
