package creational.singleton;

public enum SingletonEnum {
    INSTANCE("my instance");

    private String name;

    SingletonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}