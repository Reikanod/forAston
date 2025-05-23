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
/*
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getSquare() {
        return this.length * this.width;
    }

    @Override
    public double getArea() {
        return this.length * 2 + 2 * this.width;
    }*/
}
