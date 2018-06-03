package ImpaqTask;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DisplayLCDTest {

    @Test
    public void getTotalPriceShouldReturnCorrectTotalPrice() {
        //given
        DisplayLCD displayLCD = new DisplayLCD();
        displayLCD.addProduct(new Product("milk", 1234, 2.50));
        displayLCD.addProduct(new Product("bread", 2345, 4.30));
        //when
        double expectedTotalPrice = 6.80;
        double totalPrice = displayLCD.getTotalPrice();
        //then
        Assertions.assertThat(totalPrice).isEqualTo(expectedTotalPrice);
    }
    @Test
    public void getTotalPriceShouldSayThatPricesAreDifferent() {
        //given
        DisplayLCD displayLCD = new DisplayLCD();
        displayLCD.addProduct(new Product("milk", 1234, 2.50));
        displayLCD.addProduct(new Product("bread", 2345, 4.30));
        //when
        double expectedTotalPrice = 2.0;
        double totalPrice = displayLCD.getTotalPrice();
        //then
        Assertions.assertThat(totalPrice).isNotEqualTo(expectedTotalPrice);
    }
}