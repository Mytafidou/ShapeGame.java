public class Square extends Shape {
    public Square(int surroundingSquareArea) {
        super("Square", surroundingSquareArea);
    }

    @Override
    public double computeArea() {
        return getSurroundingSquareArea();
    }

    @Override
    public String toString() {
        return String.format("%s:%.1f", getType(), (double) computeArea());
    }
}