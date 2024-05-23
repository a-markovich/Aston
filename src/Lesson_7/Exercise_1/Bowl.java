package Lesson_7.Exercise_1;

public class Bowl {
    private int food = 0;

    public void addFood(int newFood) {
        if (newFood < 0) {
            System.out.println("Из миски нельзя забрать еду!");
        } else if (newFood == 0) {
            System.out.println("Ничего не добавлено!");
        } else {
            food += newFood;
            System.out.printf("Добавлено %d ед. еды. Всего в миске %d ед. еды.\n", newFood, food);
        }
    }

    public void setFood(int portion) {
        if (portion < food) {
            food -= portion;
        }
    }

    public int getFood() {
        return food;
    }
}
