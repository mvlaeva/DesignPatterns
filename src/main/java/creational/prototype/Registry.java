package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setTimeLength("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setPagesCount(500);
        book.setPrice(12.99);
        book.setTitle("Basic Book");
        items.put("Book", book);
    }
}
