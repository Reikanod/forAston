public class Start {
    public static void main(String[] args) {
        // Вывожу в консоль данные о продукте
        System.out.println("Вывожу первую машину");
        Product gorgeousCar = new Product("Lada Niva", "2024", "VAZ", "Russia", 2000000, false);
        gorgeousCar.displayProduct();

        // Создаем массив из 5 товаров и проверяю вывод
        System.out.println("\nВывожу список из 5 продуктов");
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Sasung S105", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        productsArray[1] = new Product("Abibas 2poi", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        productsArray[2] = new Product("Niketos 4you", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        productsArray[3] = new Product("Appil 8me", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        productsArray[4] = new Product("XiXiomi touchMe", "2025", "PodvalProduction", "Uzbekistan", 2000, true);
        for (Product product : productsArray) {
            product.displayProduct();
        }
    }
}
