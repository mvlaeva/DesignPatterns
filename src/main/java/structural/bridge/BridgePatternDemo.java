package structural.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(4, 4, 10, new RedCircle());
        Shape greenCircle = new Circle(6, 6, 5, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
