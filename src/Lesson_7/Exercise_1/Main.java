package Lesson_7.Exercise_1;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик");
        Cat catShanti = new Cat("Шанти");
        catBarsik.run(0);
        catBarsik.run(20);
        catBarsik.run(201);
        catBarsik.run(-20);
        catBarsik.swim(23);
        Bowl catBowl = new Bowl();

        catBowl.addFood(15);
        catBowl.addFood(55);
        catBowl.addFood(0);
        catBowl.addFood(-5);

        catBarsik.eatFromDish(catBowl, 15);
        catShanti.eatFromDish(catBowl, 15);
        catShanti.eatFromDish(catBowl, 15);

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Пушок");
        catsArray[1] = new Cat("Белка");
        catsArray[2] = new Cat("Смоки");
        catsArray[3] = new Cat("Кэсси");
        catsArray[4] = new Cat("Агата");

        for (Cat cat : catsArray) {
            cat.eatFromDish(catBowl, 15);
        }
        for (Cat cat : catsArray) {
            cat.checkSatiety();
        }

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(0);
        dogBobik.run(-20);
        dogBobik.run(20);
        dogBobik.run(520);
        dogBobik.swim(0);
        dogBobik.swim(-5);
        dogBobik.swim(5);
        dogBobik.swim(15);

        System.out.printf("Количество животных: %d.\nКоличество котов: %d.\nКоличество собак: %d.\n",
                Animal.getAnimalCount(), Cat.getCatCount(), Dog.getDogCount());
    }
}
