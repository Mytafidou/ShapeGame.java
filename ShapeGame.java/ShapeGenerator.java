import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShapeGenerator {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private static final int[] POSSIBLE_SIZES = {1, 2, 3, 4, 8, 12, 16};
    private Random rand = new Random();

    public ShapeGenerator(int shapesPerType) {
        initializeShapes(shapesPerType);
    }

    private void initializeShapes(int shapesPerType) {
        for (int i = 0; i < shapesPerType; i++) {
            for (int size : POSSIBLE_SIZES) {
                shapes.add(new Square(size));
                shapes.add(new Triangle(size));
                shapes.add(new Pentagon(size));
                shapes.add(new Circle(size));
                shapes.add(new BonusCircle(size, rand.nextInt(10) + 1));
            }
        }
        Collections.shuffle(shapes);
    }

    public Shape nextShape() {
        if (!shapes.isEmpty()) {
            return shapes.remove(rand.nextInt(shapes.size()));
        }
        return null;
    }

    public boolean hasShape() {
        return !shapes.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(shape).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ShapeGenerator generator = new ShapeGenerator(2);
        while (generator.hasShape()) {
            Shape shape = generator.nextShape();
            System.out.println("Next shape: " + shape);
            System.out.println(generator);
        }
    }
}