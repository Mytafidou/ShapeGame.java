public class Pentagon extends Shape {
    public Pentagon(int surroundingSquareArea) {
        super("Pentagon", surroundingSquareArea);
    }

    @Override
    public double computeArea() {
        return 0.75 * getSurroundingSquareArea();
    }

    @Override
    public String toString() {
        return String.format("%s:%.1f", getType(), computeArea());
    }
}