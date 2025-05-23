public class Triangle extends Shapes implements GeomShapeInterface {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c, String bodyColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        setBodyColor(bodyColor);
        setBorderColor(borderColor);
    }


    public int[] getSides() {
        return new int[]{a, b, c};
    }
}
