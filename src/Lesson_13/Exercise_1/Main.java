package Lesson_13.Exercise_1;

public class Main {
    public static void main(String[] args) {

        String[] animalArray = {"Собака", "Кот", "Попугай", "Кролик", "Хорек",
                "Собака", "Кот", "Попугай", "Кролик", "Хорек", "СОБАКА", "КОТ", "КРОЛИК"};

        String[] animalArray2 = {"Волк", "Лиса", "Медведь", "Заяц", "ВОЛК",
                "МЕДВЕДЬ", "ЛИСА", "ЗАЯЦ", "МЕДВЕДЬ", "лиса"};

        Words.printListOfUniqueWords(animalArray);
        Words.printNumberOfUniqueWord(animalArray);

        Words.printListOfUniqueWords(animalArray2);
        Words.printNumberOfUniqueWord(animalArray2);
    }
}
