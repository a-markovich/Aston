package Lesson_7.Exercise_1;

public class Dog extends Animal {
    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int length) {
        int runLimit = 500;
        if (length < 0) {
            System.out.println("Неверное значение!");
        } else if (length > runLimit) {
            System.out.printf("Максимальная длина препятствия - %d м.\n", runLimit);
        } else {
            System.out.printf("%s пробежал(-а) %d м.\n", name, length);
        }
    }

    @Override
    public void swim(int length) {
        int swimLimit = 10;
        if (length < 0) {
            System.out.println("Неверное значение!");
        } else if (length > swimLimit) {
            System.out.printf("Максимальная длина препятствия - %d м.\n", swimLimit);
        } else {
            System.out.printf("%s пролыл(-а) %d м.\n", name, length);
        }
    }
}
