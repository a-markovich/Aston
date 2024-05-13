package Lesson_7.Exercise_2;

public class Triangle implements Figure {
    private final float sideA;
    private final float sideB;
    private final float sideC;
    private final String fillColor;
    private final String borderColor;

    Triangle(float sideA, float sideB, float sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    public boolean checkExistenceOfTriangle() {
        if ((sideA + sideB >= sideC) && (sideA + sideC >= sideB) && (sideB + sideC >= sideA)) {
            return true;
        } else {
            System.out.println("Неверные данные! " +
                    "Сумма длин двух любых сторон треугольника всегда больше длины третьей стороны.");
            return false;
        }
    }

    @Override
    public double getPerimeter() {
        if (checkExistenceOfTriangle()) {
            return sideA + sideB + sideC;
        } else {
            return 0;
        }
    }

    @Override
    public double getArea() {
        if (checkExistenceOfTriangle()) {
            double halfP = (sideA + sideB + sideC) / 2;
            return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
        } else {
            return 0;
        }
    }
}
