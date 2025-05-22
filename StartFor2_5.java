public class StartFor2_5 {
    public static void main(String[] args) {
        DogFor2_5 bobik = new DogFor2_5("Бобик");
        CatFor2_5 murka = new CatFor2_5("Мурка");

        bobik.run(200);
        bobik.swim(5);
        System.out.println("Пёсей всего было: " + AnimalFor2_5.countDogs + " шт.\n");

        murka.run(200);
        murka.swim(5);
        System.out.println("Котев всего было: " + AnimalFor2_5.countCats + " шт.\n");

        BowlForCats.setFoodAmount(30);
        System.out.println("Количество еды в миске: " + BowlForCats.getFoodAmount());
        CatFor2_5[] cats = new CatFor2_5[7];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new CatFor2_5("Мурка " + (i + 1));
        }

        for (int i = 0; i < cats.length; i++) {
            if (BowlForCats.getFoodAmount() < cats[i].getBellyVolume()) {
                System.out.println("Мурка " + cats[i].getName() + " осталась без еды и вынуждена прибегнуть к насилию");
            } else {
                cats[i].eatBowl();
                cats[i].setBellyful(true);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Животик объекта " + cats[i].getName() + " полон: " + cats[i].isBellyful());
        }

        System.out.println("\n Пополняем миску с едой...");
        BowlForCats.setFoodAmount(30);
        System.out.println("<\n Маска пополнена. Текущий объем миски: " + BowlForCats.getFoodAmount());
    }
}
