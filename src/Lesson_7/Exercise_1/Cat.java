package Lesson_7.Exercise_1;

public class Cat extends Animal {
    private boolean satiety = false;
    static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eatFromDish(Bowl dish, int portion) {
        if (satiety) {
            System.out.printf("%s сыт(-а)!\n", name);
        } else if (portion > dish.getFood()) {
            System.out.printf("%s голодный(-ая)! Добавьте %d ед. еды!\n", name, portion - dish.getFood());
        } else {
            dish.setFood(portion);
            this.satiety = true;
            System.out.printf("%s покушал(-a)!\n", name);
        }
    }

    public void checkSatiety() {
        if (satiety) {
            System.out.printf("%s сыт(-а)!\n", name);
        } else {
            System.out.printf("%s голоден(-нa)!\n", name);
        }
    }

    @Override
    public void run(int length) {
        int runLimit = 200;
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
        System.out.println("Кот не умеет плавать");
    }
}
