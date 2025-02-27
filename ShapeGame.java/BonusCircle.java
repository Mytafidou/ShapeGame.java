public class BonusCircle extends Circle {
    private int bonus;

    public BonusCircle(int surroundingSquareArea, int bonus) {
        super(surroundingSquareArea);
        this.bonus = bonus;
    }

    @Override
    public double computePoints() {
        return super.computeArea() + bonus;
    }

    @Override
    public String toString() {
        return String.format("%s:%.3f (Bonus:%d)", getType(), computeArea(), bonus);
    }
}
