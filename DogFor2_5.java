import java.util.Objects;

public class DogFor2_5 extends AnimalFor2_5{
    String name;

    public DogFor2_5(String name){
        this.name = name;
        countDogs += 1;
        this.limSwim = 10;
        this.limRun = 500;
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
        } else if (method.equals("swim") && len < this.limSwim) {
            return "Объект " + this.name + " проплыл " + len + " м.";
        } else if (method.equals("run") && len < this.limRun) {
            return "Объект " + this.name + " пробежал " + len + " м.";
        }
        return "";
    }
}
