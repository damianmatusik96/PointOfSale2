package ImpaqTask;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ReaderTest {

    @Test
    public void convertBarCodeShouldSayBarCodesMatches() {
        //given
        int expectedBarCode = 1234;
        int actualBarCode;
        String inputBarCode = "1234";
        Reader reader = new Reader();
        //when
        reader.convertBarCode(inputBarCode);
        actualBarCode = reader.getInputBarCode();
        //then
        Assertions.assertThat(actualBarCode).isEqualTo(expectedBarCode);
    }
}