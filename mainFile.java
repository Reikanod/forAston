public class mainFile {
    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public static void summArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length == 0) {
            throw new IllegalArgumentException("ОЙБАЛБЕС: Массив не может быть пустым");
        } else if ((array.length != 4) || (array[0].length != 4)) {
            throw new MyArraySizeException("ОЙБАЛБЕС: Массив неверной размерности");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("ОЙБАЛБЕС: У тебя полная шляпа в ячейке: " + i + j +
                            ". В твоей ячейке " + array[i][j].getClass().getName() + " со значением: " + array[i][j]);
                }
            }
        }
        System.out.println(sum);
    }

    public static void printArray(String[][] array) {
       for (String[] row : array) {
           for (String col : row) {
               System.out.print(col + " ");
           }
           System.out.println();
       }
    }

    public static String[][] createArray(int size, String amount) {
        String[][] array = new String[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = amount;
            }
        }
        return array;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arrWithBadValues = createArray(4, "df");
        String[][] arrWithBadSize = createArray(3, "df");
        String[][] arrWithoutProblems = createArray(4,"5");

        System.out.println("Массив с неправильными данными:");
        printArray(arrWithBadValues);
        try {
            summArray(arrWithBadValues);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("Массив с неправильным размером:");
        printArray(arrWithBadSize);
        try {
            summArray(arrWithBadSize);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("Массив -правильный:");
        printArray(arrWithoutProblems);
        try {
            summArray(arrWithoutProblems);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nВыбросить ошибку ArrayIndexOutOfBoundsException");
        int[] arr = {1, 2};
        try {
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ОЙБАЛБЕС: " + e.getMessage());
        }
    }
}
