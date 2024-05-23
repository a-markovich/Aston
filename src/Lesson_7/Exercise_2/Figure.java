package Lesson_7.Exercise_2;

public interface Figure {
    String getFillColor();

    String getBorderColor();

    double getPerimeter();

    double getArea();

    default void printInfo() {
        System.out.println(
                "Периметр: " + getPerimeter() + "\n" +
                        "Площадь: " + getArea() + "\n" +
                        "Цвет фона: " + getFillColor() + "\n" +
                        "Цвет границ: " + getBorderColor() + "\n"
        );
    }
}
