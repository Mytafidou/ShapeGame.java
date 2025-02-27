import java.util.Stack;
import java.util.Scanner;

public class Player {
    private Stack<Shape> stack;
    private int maxStackSize;
    private double points;
    private Scanner scanner;

    public Player(int maxStackSize) {
        this.stack = new Stack<>();
        this.maxStackSize = maxStackSize;
        this.points = 0.0;
        this.scanner = new Scanner(System.in);
    }

    public void playShape(Shape shape) {
        System.out.println("\nIncoming shape " + shape);
        System.out.println("Do you want to accept? (y/n)");
        String input = scanner.nextLine();

        if ("y".equalsIgnoreCase(input)) {
            double shapePoints = shape.computePoints();
            boolean shapeRemoved = false;

            if (!stack.isEmpty()) {
                Shape topShape = stack.peek();
                if (shape.sameArea(topShape)) {
                    shapePoints *= 10;
                    System.out.println("10X points!");
                }
                if (shape.sameType(topShape)) {
                    stack.pop();
                    shapeRemoved = true;
                    System.out.println("Top shapes removed");
                }
            }

            if (!shapeRemoved) {
                stack.push(shape);
            }

            points += shapePoints;
            System.out.println("Added " + shapePoints + " points");
            //System.out.println(String.format("Added %.3f points", shapePoints));


        }
    }

    public boolean isStackFull() {
        return stack.size() >= maxStackSize;
    }

    public void printStack() {
        int i = stack.size();
        for (Shape shape : stack) {
            System.out.println("\t\t" + i-- + ":" + shape);
        }
    }



    public double getPoints() {
        return points;
    }
}