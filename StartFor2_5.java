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

        BowlForCats.setFoodAmount(100);
        murka.eatBowl(10);
    }
}
