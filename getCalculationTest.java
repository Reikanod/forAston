import org.testng.Assert;
import org.testng.annotations.Test;

public class getCalculationTest {
    @Test
    void calc_3plus2() {
        Assert.assertEquals(Calculations.getCalculation(3, 2, "+"), 5);
    }

    @Test
    void calc_M3plusM2() {
        Assert.assertEquals(Calculations.getCalculation(-3, 2, "+"), -1);
    }

    @Test
    void calc_0plus0() {
        Assert.assertEquals(Calculations.getCalculation(0, 0, "+"), 0);
    }

    @Test
    void calc_M2minusM3() {
        Assert.assertEquals(Calculations.getCalculation(-2, -3, "-"), 1);
    }

    @Test
    void calc_0minus0() {
        Assert.assertEquals(Calculations.getCalculation(0, 0, "-"), 0);
    }

    @Test
    void calc_5minus10() {
        Assert.assertEquals(Calculations.getCalculation(5, 10, "-"), -5);
    }

    @Test
    void calc_5multiply5() {
        Assert.assertEquals(Calculations.getCalculation(5, 5, "*"), 25);
    }

    @Test
    void calc_5multiplyM5() {
        Assert.assertEquals(Calculations.getCalculation(5, -5, "*"), -25);
    }

    @Test
    void calc_0multiply5() {
        Assert.assertEquals(Calculations.getCalculation(0, 5, "*"), 0);
    }

    @Test
    void calc_M5multiplyM5() {
        Assert.assertEquals(Calculations.getCalculation(-5, -5, "*"), 25);
    }

    @Test
    void calc_5divide2() {
        Assert.assertEquals(Calculations.getCalculation(5, 2, "/"), 2.5, 0.001);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    void calc_5divide0() {
        Calculations.getCalculation(5, 0, "/");
    }

    @Test
    void calc_M5divideM2() {
        Assert.assertEquals(Calculations.getCalculation(-5, -2, "/"), 2.5, 0.001);
    }

    @Test
    void calc_0divide2() {
        Assert.assertEquals(Calculations.getCalculation(0, 2, "/"), 0, 0.001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void badMethod_letter() {
        Calculations.getCalculation(5, 0, "d");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void badMethod_null() {
        Calculations.getCalculation(5, 0, "");
    }
}