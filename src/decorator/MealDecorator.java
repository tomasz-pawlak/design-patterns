package decorator;

public class MealDecorator extends Meal {

    Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }
}
