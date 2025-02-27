public class Circle extends Shape {
    public Circle(int surroundingSquareArea) {
        super("Circle", surroundingSquareArea);
    }

    @Override
    public double computeArea() {
        return 3.14 / 4 * getSurroundingSquareArea();
    }

    @Override
    public String toString() {
        return String.format("%s:%.3f", getType(), computeArea());
    }
}