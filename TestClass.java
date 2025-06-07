import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    @Nested
    class getCalculationTest {
        @Test void calc_3plus2() { assertEquals(5, Calculations.getCalculation(3, 2, "+")); }
        @Test void calc_M3plusM2() { assertEquals(-1, Calculations.getCalculation(-3, 2, "+")); }
        @Test void calc_0plus0() { assertEquals(0, Calculations.getCalculation(0, 0, "+")); }

        @Test void calc_M2minusM3() { assertEquals(1, Calculations.getCalculation(-2, -3, "-")); }
        @Test void calc_0minus0() { assertEquals(0, Calculations.getCalculation(0, 0, "-")); }
        @Test void calc_5minus10() { assertEquals(-5, Calculations.getCalculation(5, 10, "-")); }

        @Test void calc_5multiply5() { assertEquals(25, Calculations.getCalculation(5, 5, "*")); }
        @Test void calc_5multiplyM5() { assertEquals(-25, Calculations.getCalculation(5, -5, "*")); }
        @Test void calc_0multiply5() { assertEquals(0, Calculations.getCalculation(0, 5, "*")); }
        @Test void calc_M5multiplyM5() { assertEquals(25, Calculations.getCalculation(-5, -5, "*")); }

        @Test void calc_5divide2() { assertEquals(2.5, Calculations.getCalculation(5, 2, "/")); }
        @Test void calc_5divide0() { assertThrows(ArithmeticException.class, () -> Calculations.getCalculation(5, 0, "/")); }
        @Test void calc_M5divideM2() { assertEquals(2.5, Calculations.getCalculation(-5, -2, "/")); }
        @Test void calc_0divide2() { assertEquals(0, Calculations.getCalculation(0, 2, "/")); }

        @Test void badMethod_letter() { assertThrows(IllegalArgumentException.class, () -> Calculations.getCalculation(5, 0, "d")); }
        @Test void badMethod_null() { assertThrows(IllegalArgumentException.class, () -> Calculations.getCalculation(5, 0, "")); }
    }

    @Nested
    class getTriangleAreaTest {
        @Test void normalData() {assertEquals(84.0, Calculations.getTriangleArea(14, 13, 15));}
        @Test void notTriangle() {assertThrows(IllegalArgumentException.class, () -> Calculations.getTriangleArea(1, 2, 5)); }
        @Test void badSides() {assertThrows(IllegalArgumentException.class, () -> Calculations.getTriangleArea(0, 2, -3)); }
    }

    @Nested
    class getFactorial {
        @Test void normalData() {assertEquals(120, Calculations.getFactorial(5));}
        @Test void zero() {assertEquals(1, Calculations.getFactorial(0));}
        @Test void negativeNum() { assertThrows(IllegalArgumentException.class, () -> Calculations.getFactorial(-1)); }
        @Test void tooBigNum() { assertThrows(IllegalArgumentException.class, () -> Calculations.getFactorial(100)); }
    }

    @Nested
    class showBiggestNum {
        @Test void AisBigger() { assertEquals(8, Calculations.showBiggestNum(4, 8)); }
        @Test void negativeNums() { assertEquals(-1, Calculations.showBiggestNum(-4, -1)); }
        @Test void sameNums() { assertEquals(10, Calculations.showBiggestNum(10, 10)); }
    }
}
