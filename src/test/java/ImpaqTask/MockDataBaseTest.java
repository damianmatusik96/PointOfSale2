package ImpaqTask;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MockDataBaseTest {

    @Test
    public void getByBarCodeShouldReturnTheSameProduct() {
        //given
        Product expected = new Product("Milk", 1234, 2.50);
        ProductDAO dao = new MockDataBase(new Product("Milk", 1234, 2.5));
        //when
        Product actual = dao.getByBarCode(1234);
        //then
        Assertions.assertThat(actual).isEqualToComparingFieldByField(expected);
    }

    @Test
    public void getByBarCodeShouldReturnDifferentProducts() {
        //given
        Product expected = new Product("Milk", 1234, 2.50);
        ProductDAO dao = new MockDataBase(new Product("Bread", 2345, 2.5));
        //when
        Product actual = dao.getByBarCode(2345);
        //then
        Assertions.assertThat(actual).isNotEqualTo(expected);
    }

    @Test
    public void findByBarCodeShouldSayThatProductIsInDataBase() {
        //given
        ProductDAO dao = new MockDataBase(new Product("Milk", 1234, 2.50));
        //when
        boolean isAvailable = dao.findByBarCode(1234);
        //then
        Assertions.assertThat(isAvailable).isEqualTo(true);
    }

    @Test
    public void findByBarCodeShouldSayThatProductIsNotInDataBase() {
        //given
        ProductDAO dao = new MockDataBase(new Product("Milk", 1234, 2.50));
        //when
        boolean isAvailable = dao.findByBarCode(2345);
        //then
        Assertions.assertThat(isAvailable).isEqualTo(false);
    }
}