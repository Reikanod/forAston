import org.testng.Assert;
import org.testng.annotations.Test;

public class getTriangleAreaTest {
        @Test
        void normalData() {
            Assert.assertEquals(Calculations.getTriangleArea(14, 13, 15), 84.0, 0.001);
        }

        @Test(expectedExceptions = IllegalArgumentException.class)
        void notTriangle() {
            Calculations.getTriangleArea(1, 2, 5);
        }

        @Test(expectedExceptions = IllegalArgumentException.class)
        void badSides() {
            Calculations.getTriangleArea(0, 2, -3);
        }
    }