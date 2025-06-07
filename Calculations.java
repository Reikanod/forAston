public class Calculations {
    public static long getFactorial(int num) {
        if (num < 0) { throw new IllegalArgumentException("Нельзя вычислить факториал для отрицательных чисел"); }
        if (num > 20) { throw new IllegalArgumentException("Слишком большое число"); }

        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static double getTriangleArea(int sideA, int sideB, int sideC) {
        if (
                sideA + sideB <= sideC ||
                sideA + sideC <= sideB ||
                sideB + sideC <= sideA ||
                sideA <= 0 ||
                sideB <= 0 ||
                sideC <= 0
        ) {
            throw new IllegalArgumentException("Треугольника с такими сторонами не бывает");
        }

        double p = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public static double getCalculation(int A, int B, String calcMethod) {
        switch (calcMethod) {
            case "+": return (double) A + B;
            case "-": return (double) A - B;
            case "*": return (double) A * B;
            case "/":
                if (B == 0) throw new ArithmeticException("Деление на ноль");
                return (double) A / B;
            default: throw new IllegalArgumentException("Неверно введенные данные для вычислений");
        }
    }

    public static int showBiggestNum(int A, int B) {
        return Math.max(A, B);
    }
}
