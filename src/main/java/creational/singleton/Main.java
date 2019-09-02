package creational.singleton;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        System.out.println(singleton==anotherSingleton);
    }
}
