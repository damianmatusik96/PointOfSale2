package ImpaqTask;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MockDataBaseTest {

/*

    @Test
    void shouldSayReturnedProductIsEqualsWithExpected() {
        //given

        //when

        //then
        Assertions.assertEquals(milk, dataBase.getByBarCode(1234));
    }
*/

    @Test
    public void getByBarCodeShouldReturnProduct() {
        //given
        Product excpected = new Product("Milk", 123, 2.50);
        ProductDAO dao = new MockDataBase(new Product("Milk", 123, 2.5));
        //when
        Product actual = dao.getByBarCode(123);
        //then
        Assertions.assertThat(actual).isEqualToComparingFieldByField(excpected);
    }

}