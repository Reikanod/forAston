public class Start {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int C = 7;

        System.out.println(Calculations.getFactorial(A));
        System.out.println(Calculations.getCalculation(2147483647, 10, "4"));
        System.out.println(Calculations.showBiggestNum(A, B));
        System.out.println(Calculations.getTriangleArea(A, B, C));
    }
}
