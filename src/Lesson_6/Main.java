package Lesson_6;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Инженер",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Смирнов Алексей Сергеевич", "Менеджер",
                "asmirnov@mailbox.com", "892344367", 35000, 31);
        persArray[2] = new Person("Кузнецов Иван Сергеевич", "Экономист",
                "kuznetsov@mailbox.com", "893316718", 30000, 40);
        persArray[3] = new Person("Тихонов Александр Семенович", "Бухгалтер",
                "atikhonov@mailbox.com", "892376456", 45000, 50);
        persArray[4] = new Person("Сидоров Андрей Игоревич", "Юрист",
                "asidorov@mailbox.com", "892321378", 40000, 27);

        for (Person person : persArray) {
            person.getInformation();
        }

        Park ferrisWheel = new Park("Сказка");
        ferrisWheel.addAttraction("Колесо обозрения", "11:00 - 21:00", 400);
        ferrisWheel.getInfoAboutAttraction();
    }
}