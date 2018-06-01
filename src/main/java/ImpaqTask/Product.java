package ImpaqTask;

public class Product implements DisplayOnLCD{
    private int barCode;
    private double price;
    private String name;

    public Product(String name, int barCode, double price) {
        this.barCode = barCode;
        this.price = price;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + " Price: " + price);
    }

    public int getBarCode() {
        return barCode;
    }

    public double getPrice() {
        return price;
    }
}
