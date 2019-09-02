package creational.prototype;

public class Item implements Cloneable{
    private double price;
    private String title;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
