package creational.builder;

public class Meal {

    private final String breakfast;
    private final String brunch;
    private final String lunch;
    private final String dinner;

    private Meal(Builder builder) {
        this.breakfast = builder.breakfast;
        this.brunch = builder.brunch;
        this.lunch = builder.lunch;
        this.dinner = builder.dinner;
    }

    @Override
    public String toString() {
        return "Builder{" +
            "breakfast='" + breakfast + '\'' +
            ", brunch='" + brunch + '\'' +
            ", lunch='" + lunch + '\'' +
            ", dinner='" + dinner + '\'' +
            '}';
    }

    public static class Builder {
        private String breakfast;
        private String brunch;
        private String lunch;
        private String dinner;

        public Meal buildMeal() {
            return new Meal(this);
        }

        public Builder breakfast(String breakfast) {
            this.breakfast = breakfast;
            return this;
        }

        public Builder brunch(String brunch) {
            this.brunch = brunch;
            return this;
        }

        public Builder lunch(String lunch) {
            this.lunch = lunch;
            return this;
        }

        public Builder dinner(String dinner) {
            this.dinner = dinner;
            return this;
        }
    }
}