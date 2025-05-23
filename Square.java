public class Square extends Shapes implements GeomShapeInterface {
    private int length;
    private int width;


    public Square(int length, int width, String bodyColor, String borderColor) {
        this.length = length;
        this.width = width;
        super.setBodyColor(bodyColor);
        super.setBorderColor(borderColor);
    }

    public int[] getSides() {
        return new int[] {length, width};
    }
}
