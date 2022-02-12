import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;

public class PostcodeTest {

    HttpHandler test = new HttpHandler();

    @Test
    public void invalidPostcodeFailsValidation() throws IOException, InterruptedException {
        // Check API returns false for invalid postcode
        Assertions.assertEquals(test.validation("12345").getResult(), false);
    }

    @Test
    public void invalidPostcodeIsNull() throws IOException, InterruptedException {
        // Check invalid postcode does not get through validation if statement
        Assertions.assertEquals(test.check("12345").getResult(), null);
    }

}
