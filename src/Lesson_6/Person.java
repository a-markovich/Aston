package Lesson_6;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email,
                  String tel, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void getInformation() {
        System.out.println("ФИО: " + fullName + "\nДолжность: " +
                position + "\nEmail: " + email + "\nТелефон: " +
                tel + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }
}
