public class Park {
    String name;

    class Attractions {
        String name;
        String info;
        String workTime;
        int price;

        public Attractions(String name, String info, String workTime, int price) {
            this.name = name;
            this.info = info;
            this.workTime = workTime;
            this.price = price;
        }
    }

}