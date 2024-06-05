package Lesson_13.Exercise_2;

import java.util.*;

public class PhoneBook {

    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (!phoneBook.containsKey(phone)) {
            phoneBook.put(phone, surname);
        } else {
            System.out.println("Номер " + phone + " уже существует!");
        }
    }

    public List<String> get(String surname) {
        ArrayList<String> phone = new ArrayList<>();
        for (String key : phoneBook.keySet()) {
            if (Objects.equals(phoneBook.get(key), surname)) {
                phone.add(key);
            }
        }
        return phone;
    }

    public void printPhone(String surname) {
        List<String> phone = get(surname);
        if (phone.size() == 0) {
            System.out.println("Данные отсутствуют!");
        }
        for (String phoneElem : phone) {
            System.out.println(surname + ": " + phoneElem);
        }
    }
}
