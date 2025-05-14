public class Task3 {
    public static void main(String[] args) {
        // первое задание
        class Product {
            String name;
            String productionDate;
            String manufacturer;
            String productionCountry;
            int price;
            boolean bookingStatus;

            public Product(String name, String productionDate, String manufacturer, String productionCountry, int price, boolean bookingStatus) {
                this.name = name;
                this.productionDate = productionDate;
                this.manufacturer = manufacturer;
                this.productionCountry = productionCountry;
                this.price = price;
                this.bookingStatus = bookingStatus;
            }

            public void displayProduct() {
                System.out.println(
                        "Name: " + this.name +
                                "\nProduction Date: " + this.productionDate +
                                "\nManufacturer: " + this.manufacturer +
                                "\nProduction country: " + this.productionCountry +
                                "\nPrice: " + this.price +
                                "\nBooking Status: " + this.bookingStatus
                );
            }
        }

        Product gorgeousCar = new Product("Lada Niva", "2024", "VAZ", "Russia", 2000000, false);
        gorgeousCar.displayProduct();

        // Второе задание
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Sasung S105", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        productsArray[1] = new Product("Abibas 2poi", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        productsArray[2] = new Product("Niketos 4you", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        productsArray[3] = new Product("Appil 8me", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        productsArray[4] = new Product("XiXiomi touchMe", "2025", "PodvalProduction", "Uzbekistan", 2000, true);

        // Третье задание
        class Park {
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



    }
}
