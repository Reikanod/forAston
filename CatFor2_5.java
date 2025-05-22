public class CatFor2_5 extends AnimalFor2_5 {
    String name;

    public CatFor2_5(String name){
        this.name = name;
        countCats += 1;
        this.limSwim = 0;
        this.limRun = 200;
    }

    @Override
    public void run(int len) {
        String result = checkLimits("run", len);
        System.out.println(result);
    }

    @Override
    public void swim(int len) {
        String result = checkLimits("swim", len);
        System.out.println(result);
    }

    public String checkLimits(String method, int len) {
        if (len < 0) {
            return ("Ошибка в указании расстояния");
        } else if (len == 0) {
            switch (method) {
                case "swim":
                    return "Увы, но " + this.name + " повторяет участь Муму по твоей вине";
                case "run":
                    return this.name + " никуда не побежит. Спит. Не будить";
            }
        } else if (method.equals("swim") && len > this.limSwim) {
            return this.name + " - это просто " + this.name + ", а не потомок Посейдона. Так далеко не заплывет";
        } else if (method.equals("run") && len > this.limRun) {
            return this.name + " не Геракл. Так далеко не убежит";
        } else if (method.equals("swim") && len <= this.limSwim) {
            return "Объект " + this.name + " проплыл " + len + " м.";
        } else if (method.equals("run") && len <= this.limRun) {
            return "Объект " + this.name + " пробежал " + len + " м.";
        }
        return "Если это видишь - в методе checkLimits ошибка";
    }

    public void eatBowl(int amountIntoCat) {
        if (BowlForCats.getFoodAmount() == 0) {
            System.out.println("Не издевайся над животными. Тарелка пуста!");
        } else if (BowlForCats.getFoodAmount() < amountIntoCat) {
            System.out.println("У шерстяного слишком большие запросы. Столько еды в миске нет");
        } else {
            BowlForCats.setFoodAmount(BowlForCats.getFoodAmount() - amountIntoCat);
            System.out.println(this.name + " совершила ритуал поглощения. Еды осталось: " + BowlForCats.getFoodAmount());
        }
    }
}
