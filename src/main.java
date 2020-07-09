import decorator.*;


//Minusy - bazuje na dziedziczeniu(tylko 1 w javie), mozliwość nadpisywania róznych metod moze stworzyc bałagan
//Przykłady w javie to inputStream
public class main {
    public static void main(String[] args) {

        System.out.println("New meal:");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();
        System.out.println("\nNew meal:");
        Meal meal= new ShrimpMealDecorator(new RiceMeal());
        meal.prepareMeal();
        System.out.println("\nNowy posiłek: ");
        Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();
    }


}

