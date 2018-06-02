package ImpaqTask;

import java.util.HashMap;
import java.util.Map;

public class MockDataBase implements ProductDAO{
    private Map<Integer,Product> dataBaseProducts;

    public MockDataBase(Product... products) {
        dataBaseProducts = new HashMap<>();
        for(Product product: products){
            dataBaseProducts.put(product.getBarCode(), product);
        }
    }
    @Override
    public Product getByBarCode(int barCode) {
        return dataBaseProducts.get(barCode);
    }

    @Override
    public boolean findByBarCode(int scannedBarCode) {
        return dataBaseProducts.containsKey(scannedBarCode);

    }

}
