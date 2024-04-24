import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords(); // 1
        checkSumSign(); // 2
        printColor(); // 3
        compareNumbers(); // 4
        System.out.println(checkSumNumbers(-15, 30)); // 5
        printNumberSign(0); // 6
        System.out.println(checkSignOfNumber(0)); // 7
        printString("Hello!", 3); // 8
        System.out.println(checkThatYearIsLeap(2000)); // 9
        replaceArrayElements(); // 10
        fillArray(); // 11
        doubleArrayElements(); // 12
        createSquareArray(); // 13
        System.out.println(Arrays.toString(getArray(5, -1))); // 14
    }

    /*    1. Создайте метод printThreeWords(),
        который при вызове должен отпечатать в столбец три слова:
        Orange, Banana, Apple.*/
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    /*    2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
        и инициализируйте их любыми значениями, которыми захотите.
        Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
        то вывести в консоль сообщение “Сумма положительная”,
        в противном случае - “Сумма отрицательная”;*/
    public static void checkSumSign() {
        int a = -1;
        int b = 0;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /*    3. Создайте метод printColor() в теле которого задайте int переменную value
        и инициализируйте ее любым значением. Если value меньше 0 (0 включительно),
        то в консоль метод должен вывести сообщение “Красный”,
        если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
        то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;*/
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /*    4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
        и инициализируйте их любыми значениями, которыми захотите.
        Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
        в противном случае “a < b”;*/
    public static void compareNumbers() {
        int a = 0;
        int b = -1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /*    5. Напишите метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно),
        если да – вернуть true, в противном случае – false.*/
    public static boolean checkSumNumbers(int firstInteger, int secondInteger) {
        int sum = firstInteger + secondInteger;
        return sum >= 10 && sum <= 20;
    }

    /*    6. Напишите метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.*/
    public static void printNumberSign(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    /*    7. Напишите метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static boolean checkSignOfNumber(int num) {
        return num < 0;
    }

    /*    8. Напишите метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void printString(String str, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(str);
        }
    }

    /*    9. Напишите метод, который определяет, является ли год високосным,
        и возвращает boolean (високосный - true, не високосный - false).
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static boolean checkThatYearIsLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /*    10. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void replaceArrayElements() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*    11. Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*    12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньше 6 умножить на 2;*/
    public static void doubleArrayElements() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*    13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];*/
    public static void createSquareArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                arr[i][arr[i].length - 1 - i] = 1;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    /*    14. Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len,
        каждая ячейка которого равна initialValue.*/
    public static int[] getArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}