import org.testng.Assert;
import org.testng.annotations.Test;

public class getFactorialTest {
    @Test
    void normalData() {
        Assert.assertEquals(Calculations.getFactorial(5), 120);
    }

    @Test
    void zero() {
        Assert.assertEquals(Calculations.getFactorial(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void negativeNum() {
        Calculations.getFactorial(-1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void tooBigNum() {
        Calculations.getFactorial(100);
    }
}
