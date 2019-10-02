package structural.proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_best_56.jpg");

        //will be loaded from disc
        image.display();
        System.out.println();

        //will not be loaded from disc
        image.display();
    }
}
