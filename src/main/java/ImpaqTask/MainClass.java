package ImpaqTask;

public class MainClass {
    private static boolean exitCode = false;

    public static void main(String[] args) {
        Product milk = new Product("Milk", 1234, 2.50);
        Product bread = new Product("Bread", 2345, 2.20);
        Product beer = new Product("Beer", 3456, 4.50);
        Product cereal = new Product("Cereal", 4567, 6.19);
        Reader reader = new Reader();
        ProductDAO dataBaseDao = new MockDataBase(milk, bread, beer, cereal);
        DisplayLCD lcd = new DisplayLCD();
        Printer printer = new Printer();

        while(!exitCode) {
            reader.setReaderValue();
            if("exit".equals(reader.getBarCode())){
                System.out.println("All products: ");
                printer.printReceipe();
                System.out.println("Total price: " + lcd.getTotalPrice());
                reader.closeReader();
                exitCode = true;
                System.exit(1);
            }
            else if (dataBaseDao.findByBarCode(reader.getInputBarCode())) {
                lcd.addProduct(dataBaseDao.getByBarCode(reader.getInputBarCode()));
                printer.addProductToPrinter(dataBaseDao.getByBarCode(reader.getInputBarCode()));
                dataBaseDao.getByBarCode(reader.getInputBarCode()).display();
            }
            else{
                System.out.println("Invalid bar code, try again");
            }
        }
    }
}
