public class Task2_4_2_aboutFigures {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "white", "blue");
        Triangle triangle = new Triangle(5, 6, 7, "pink", "red");
        Square square = new Square(10, 15, "brown", "green");

        System.out.println("Круг. Периметр: " + circle.getPerimeter() + " Площадь: " + circle.getArea() +
                " // Цвет заливки: " + circle.getBodyColor() + " Цвет границы: " + circle.getBorderColor());
        System.out.println("Треугольник. Периметр: " + triangle.getPerimeter() + " Площадь: " + triangle.getArea() +
                " // Цвет заливки: " + triangle.getBodyColor() + " Цвет границы: " + triangle.getBorderColor());
        System.out.println("Прямоугольник/квадрат. Периметр: " + square.getPerimeter() + " Площадь: " + square.getArea() +
                " // Цвет заливки: " + square.getBodyColor() + " Цвет границы: " + square.getBorderColor());
    }
}
