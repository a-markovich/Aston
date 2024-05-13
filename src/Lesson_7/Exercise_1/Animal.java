package Lesson_7.Exercise_1;

public abstract class Animal {
    protected String name;
    static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int length);

    public abstract void swim(int length);
}
