public class Circle extends Shapes implements GeomShapeInterface {
    private int radius;

    public Circle(int radius, String bodyColor, String borderColor) {
        this.radius = radius;
        super.setBodyColor(bodyColor);
        super.setBorderColor(borderColor);
    }

    public int getRadius() {
        return this.radius;
    }
/*
    @Override
    public double getSquare() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }*/
}
