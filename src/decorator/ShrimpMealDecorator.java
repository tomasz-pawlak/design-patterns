package decorator;

public class ShrimpMealDecorator extends MealDecorator {
    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    public void addShrimp(){
        System.out.println("Added shrimp");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }
}
