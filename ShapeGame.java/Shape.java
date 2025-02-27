public abstract class Shape {
    private String type;
    private int surroundingSquareArea;

    public Shape(String type, int surroundingSquareArea) {
        this.type = type;
        this.surroundingSquareArea = surroundingSquareArea;
    }
    public String getType() {
        return type;
    }

    public abstract double computeArea();

    public double computePoints() {
        return computeArea();
    }

    public boolean sameArea(Shape other) {
        return this.surroundingSquareArea == other.surroundingSquareArea;
    }

    public boolean sameType(Shape other) {
        return this.type.equals(other.type);
    }

    @Override
    public String toString() {
        return String.format("%s:%.1f", getType(), (double) getSurroundingSquareArea());
    }

    public int getSurroundingSquareArea() {
        return surroundingSquareArea;
    }
}
