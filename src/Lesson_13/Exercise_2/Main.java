package Lesson_13.Exercise_2;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add("Иванов", "80298982020");
        phoneBook1.add("Сергеев", "80298982020");
        phoneBook1.add("Петров", "80298982121");
        phoneBook1.add("Сидоров", "80298982222");
        phoneBook1.add("Иванов", "80298982323");
        phoneBook1.add("Петров", "80298982424");
        phoneBook1.add("Иванов", "80298982525");

        phoneBook1.printPhone("Иванов");
        phoneBook1.printPhone("Сергеев");
    }
}
