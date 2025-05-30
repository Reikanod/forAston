public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String productionCountry;
    private int price;
    private boolean bookingStatus;

    // Конструктор
    public Product(String name, String productionDate, String manufacturer, String productionCountry, int price, boolean bookingStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.productionCountry = productionCountry;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }

    // Геттеры

    // Сеттеры


    // Вывод в консоль продуктов
    public void displayProduct() {
        System.out.println(
                "\nName: " + this.name +
                        "\nProduction Date: " + this.productionDate +
                        "\nManufacturer: " + this.manufacturer +
                        "\nProduction country: " + this.productionCountry +
                        "\nPrice: " + this.price +
                        "\nBooking Status: " + this.bookingStatus
        );
    }
}