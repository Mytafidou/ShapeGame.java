public class Triangle extends Shape {
    public Triangle(int surroundingSquareArea) {
        super("Triangle", surroundingSquareArea);
    }

    @Override
    public double computeArea() {
        return 0.5 * getSurroundingSquareArea();
    }

    @Override
    public String toString() {
        return String.format("%s:%.1f", getType(), computeArea());
    }
}