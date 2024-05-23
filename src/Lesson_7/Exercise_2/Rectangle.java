package Lesson_7.Exercise_2;

public class Rectangle implements Figure {
    private final double width;
    private final double height;
    private final String fillColor;
    private final String borderColor;

    Rectangle(float width, float height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
