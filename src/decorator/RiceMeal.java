package decorator;

public class RiceMeal extends Meal {

    @Override
    public void prepareMeal() {
        System.out.println("Cooking rice");
    }
}
