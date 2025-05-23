public class Task2_4_2_aboutFigures {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "white", "blue");
        Triangle triangle = new Triangle(5, 6, 7, "pink", "red");
        Square square = new Square(10, 15, "brown", "green");

       /* System.out.println("Периметр круга с радиусом " + circle.getRadius() + " равен " + circle.getArea() +
                ", а его площадь: " + circle.getSquare() + ", а его цвета: " +
                circle.getBodyColor() + " и " + circle.getBorderColor());
        System.out.println("Периметр треугольника равен " + triangle.getArea() + ", а его площадь равна " +
                triangle.getSquare() + ", а его цвета: " + triangle.getBodyColor() + " и " + triangle.getBorderColor());
        System.out.println("Периметр прямоугольника равен " + square.getArea() + ", а его площадь равна " +
                square.getSquare() + ", а его цвета: " + square.getBodyColor() + " и " + square.getBorderColor());
        */

        System.out.println("Круг. Периметр: " + circle.getPerimeter() + " Площадь: " + circle.getArea() +
                " // Цвет заливки: " + circle.getBodyColor() + " Цвет границы: " + circle.getBorderColor());
        System.out.println("Треугольник. Периметр: " + triangle.getPerimeter() + " Площадь: " + triangle.getArea() +
                " // Цвет заливки: " + triangle.getBodyColor() + " Цвет границы: " + triangle.getBorderColor());
        System.out.println("Прямоугольник/квадрат. Периметр: " + square.getPerimeter() + " Площадь: " + square.getArea() +
                " // Цвет заливки: " + square.getBodyColor() + " Цвет границы: " + square.getBorderColor());
    }
}
