public class CatFor2_5 extends AnimalFor2_5 {
    private String name;
    private boolean bellyful;
    private int bellyVolume;


    public CatFor2_5(String name){
        this.name = name;
        countCats += 1;
        this.limSwim = 0;
        this.limRun = 200;
        this.bellyful = false;
        this.bellyVolume = (int) (Math.random() * 10) + 1;
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

    public void eatBowl() {
        if (BowlForCats.getFoodAmount() == 0) {
            System.out.println("Не издевайся над животными. Тарелка пуста!");
        } else if (BowlForCats.getFoodAmount() < bellyVolume) {
            System.out.println("У шерстяного слишком большие запросы. Столько еды в миске нет");
        } else {
            BowlForCats.setFoodAmount(BowlForCats.getFoodAmount() - bellyVolume);
            System.out.println(this.name + " совершила ритуал поглощения. Еды осталось: " + BowlForCats.getFoodAmount());
        }
    }

    public boolean isBellyful() {
        return bellyful;
    }
    public void setBellyful(boolean bellyStatus) {
        bellyful = bellyStatus;
    }

    public int getBellyVolume() {
        return bellyVolume;
    }
    public void setBellyVolume(int volume) {
        bellyVolume = volume;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
