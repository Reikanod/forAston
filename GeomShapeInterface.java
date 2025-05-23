interface GeomShapeInterface {

    default double getPerimeter() {
        if (this instanceof Circle) {
            return 2 * Math.PI * ((Circle) this).getRadius();
        } else if (this instanceof Triangle) {
            int[] sides = ((Triangle) this).getSides();
            return sides[0] + sides[1] + sides[2];
        } else if (this instanceof Square) {
            int[] sides = ((Square) this).getSides();
            return sides[0] + sides[1];
        }
        return 0;
    }

    default double getArea() {
        if (this instanceof Circle) {
            int radius = ((Circle) this).getRadius();
            return Math.PI * Math.pow(radius, 2);
        } else if (this instanceof Triangle) {
            int[] sides = ((Triangle) this).getSides();
            double s = (double) (sides[0] + sides[1] + sides[2]) / 2;
            return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
        } else if (this instanceof Square) {
            int[] sides = ((Square) this).getSides();
            return sides[0] * sides[1];
        }
        return 0;
    }
}
