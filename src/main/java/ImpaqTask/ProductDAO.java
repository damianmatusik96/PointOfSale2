package ImpaqTask;

public interface ProductDAO {
    Product getByBarCode(int barCode);
    boolean findByBarCode(int scannedBarCode);
    }
