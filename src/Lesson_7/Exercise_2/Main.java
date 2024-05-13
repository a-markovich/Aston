package Lesson_7.Exercise_2;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(10, 10, 10, "Красный", "Синий");
        System.out.println("Информация о треугольнике:");
        triangle.printInfo();

        Figure rectangle = new Rectangle(20, 10, "Зеленый", "Желтый");
        System.out.println("Информация о прямоугольнике:");
        rectangle.printInfo();

        Figure circle = new Circle(10, "Белый", "Черный");
        System.out.println("Информация о круге:");
        circle.printInfo();
    }
}
