package Lesson_8;

public class MyArray {
    public static int getSumOfArrayElements(String[][] arr)
            throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 || getArrayLength(arr)) {
            throw new MyArraySizeException("Неверный размер массива!");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j].trim());
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Неверные данные в ячейке: [" + i + "]" + "[" + j + "]");
                }
            }
        }
        return sum;
    }

    private static boolean getArrayLength(String[][] arr) {
        for (String[] strings : arr) {
            if (strings.length != 4) {
                return true;
            }
        }
        return false;
    }
}
