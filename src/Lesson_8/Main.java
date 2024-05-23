package Lesson_8;

public class Main {
    public static void main(String[] args) {
        String[][] strArr = new String[][]
                {
                        {"1", "2", "  3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"}
                };
        try {
            int sum = MyArray.getSumOfArrayElements(strArr);
            System.out.printf("Сумма элементов массива: %d\n", sum);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
