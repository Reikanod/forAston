import org.testng.Assert;
import org.testng.annotations.Test;

public class showBiggestNumTest {
    @Test
    void AisBigger() {
        Assert.assertEquals(Calculations.showBiggestNum(4, 8), 8);
    }

    @Test
    void negativeNums() {
        Assert.assertEquals(Calculations.showBiggestNum(-4, -1), -1);
    }

    @Test
    void sameNums() {
        Assert.assertEquals(Calculations.showBiggestNum(10, 10), 10);
    }
}