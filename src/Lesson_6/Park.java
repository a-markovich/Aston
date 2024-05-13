package Lesson_6;

public class Park {
    private String namePark;
    private Attractions attraction;

    public Park(String namePark) {
        this.namePark = namePark;
    }

    public void addAttraction(String nameAttraction, String operatingMode, int cost) {
        this.attraction = new Attractions(nameAttraction, operatingMode, cost);
    }

    public void getInfoAboutAttraction() {
        System.out.println("Название парка: " + namePark + "\nНазвание аттракциона: " + attraction.getName() +
                "\nВремя работы: " + attraction.getOperatingMode() + "\nСтоимость: " + attraction.getCost());
    }

    public class Attractions {
        private String nameAttraction;
        private String operatingMode;
        private int cost;

        public Attractions(String nameAttraction, String operatingMode, int cost) {
            this.nameAttraction = nameAttraction;
            this.operatingMode = operatingMode;
            this.cost = cost;
        }

        public String getName() {
            return nameAttraction;
        }

        public String getOperatingMode() {
            return operatingMode;
        }

        public int getCost() {
            return cost;
        }
    }
}
