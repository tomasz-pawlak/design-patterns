package decorator;

public class PotatoMeal extends Meal {
    @Override
    public void prepareMeal() {
        System.out.println("Cooking potatoes");
    }
}
