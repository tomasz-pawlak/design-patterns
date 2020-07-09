package decorator;

public class ChickenMealDecorator extends MealDecorator {
    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    public void addChicken(){
        System.out.println("Added chciken!");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }
}
