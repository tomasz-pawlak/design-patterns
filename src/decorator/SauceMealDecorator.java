package decorator;

public class SauceMealDecorator extends MealDecorator {
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    public void addSauce(){
        System.out.println("Added sauce");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }
}
