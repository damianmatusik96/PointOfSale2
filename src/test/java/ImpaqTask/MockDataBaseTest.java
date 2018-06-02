package ImpaqTask;


import junit.framework.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MockDataBaseTest {
    private Product milk;
    private MockDataBase dataBase;

    @BeforeEach
    void setUp() {
        milk = new Product("Milk", 1234, 2.50);
        dataBase = new MockDataBase(milk);
    }

    @Test
    void shouldSayReturnedProductIsEqualsWithExpected() {
        Assert.assertEquals(milk, dataBase.getByBarCode(1234));
    }

    @Test
    void shouldReturnTrueProductIsAvailable() {
        Assert.assertTrue(dataBase.findByBarCode(1234));
    }

    @Test
    void shouldReturnFalseProductIsntAvailable() {
        Assert.assertFalse(dataBase.findByBarCode(2345));
    }
}