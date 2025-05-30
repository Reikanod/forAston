import java.util.Arrays;

public class Task2_2 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColour() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 9;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumIn(int first, int second) {
        if (first + second >= 10 && first + second <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void printIfPosOrNeg(int number) {
        if (number < 0) {
            System.out.println("Передано отрицательное число");
        } else {
            System.out.println("Передано положительное число");
        }
    }

    public static boolean isPosOrNeg(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printStrNumTimes(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static boolean IsLeapYear(String str) {
        int num = Integer.parseInt(str);
        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] fillArrayWithValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("1.");
        printThreeWords();
        System.out.println("--------------------------------");

        System.out.println("2.");
        checkSumSign();
        System.out.println("-------------------------------");

        System.out.println("3.");
        printColour();
        System.out.println("-------------------------------");

        System.out.println("4.");
        compareNumbers();
        System.out.println("------------------------------");

        System.out.println("5.");
        System.out.println(isSumIn(5, 10));
        System.out.println("------------------------------");

        System.out.println("6.");
        printIfPosOrNeg(-5);
        System.out.println("------------------------------");

        System.out.println("7.");
        System.out.println(isPosOrNeg(0));
        System.out.println("------------------------------");

        System.out.println("8.");
        printStrNumTimes("азаза", 3);
        System.out.println("------------------------------");

        System.out.println("9.");
        System.out.println(IsLeapYear("2004"));
        System.out.println("------------------------------");

        System.out.println("10.");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Изначальный массив: \n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Конечный массив: \n" + Arrays.toString(arr));
        System.out.println("------------------------------");

        System.out.println("11.");
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("------------------------------");

        System.out.println("12.");
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Изначальный массив: \n" + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("Конечный массив: \n" + Arrays.toString(arr3));
        System.out.println("------------------------------");

        System.out.println("13.");
        int[][] matrix = new int[5][5];
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            matrix[i][i] = 1;
            matrix[i][j] = 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");

        System.out.println("14.");
        System.out.println(Arrays.toString(fillArrayWithValue(5, 7)));
    }
}
