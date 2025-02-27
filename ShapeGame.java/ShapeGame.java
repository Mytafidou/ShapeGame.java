import java.util.Scanner;

public class ShapeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the number of shapes per type: ");
        int shapesPerType = scanner.nextInt();

        System.out.print("Give the size of the stack for the player: ");
        int stackSize = scanner.nextInt();

        ShapeGenerator generator = new ShapeGenerator(shapesPerType);
        Player player = new Player(stackSize);

        // continue while shapes exist and stack isn't full
        while (generator.hasShape() && !player.isStackFull()) {
            System.out.println("\nCurrent stack:");
            player.printStack();

            Shape nextShape = generator.nextShape();
            player.playShape(nextShape);

            System.out.println("Player has " + player.getPoints() + " points");
            //System.out.println(String.format("Player has %.3f points", player.getPoints()));

        }

        System.out.println("\nGAME OVER");
        scanner.close();
    }
}
