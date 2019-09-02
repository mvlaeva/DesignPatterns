package creational.builder;

public class Main {

    public static void main(String[] args) {
        Meal.Builder builder = new Meal.Builder();

        builder.breakfast("Oatmeal, protein and coconut milk");
        builder.brunch("Fruits");
        builder.lunch("Spinach salad with goat cheese and pomegranate vinegar");
        builder.dinner("Omelette with cheese and green salad");

        Meal meal = builder.buildMeal();
        System.out.println(meal.toString());
    }
}
