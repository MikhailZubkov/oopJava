package DZ.Cats;

public class Task1 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 2),
                new Cat("Persik", 3),
                new Cat("Pushok", 6),
                new Cat("Murzik", 3)
        };
        int plateSize = 8;
        Plate plate = new Plate(plateSize);
        plate.info();

        for (Cat cat : cats) {
            if (cat.getAppetite() <= plate.getFood()) {
                catEat(plate, cat);
            } else {
                System.out.printf("%s - не поел, так как еды в тарелке недостаточно \n", cat.getName());
                System.out.println("Наполнили тарелку");
                plate.addFood(plateSize);
                plate.info();
                catEat(plate, cat);

            }
            plate.info();
            System.out.println();
        }

    }

    public static void catEat(Plate plate, Cat cat) {
        plate.setFood(plate.getFood() - cat.getAppetite());
        cat.setFull(true);
        System.out.printf("%s - поел %d \n", cat.getName(), cat.getAppetite());
    }

}
