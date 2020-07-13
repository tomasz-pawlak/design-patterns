package state;

public interface State {

    void insertTheCoin(CoffeeMaker coffeeMaker);
    void pushTheButton(CoffeeMaker coffeeMaker);
    void takeTheCup(CoffeeMaker coffeeMaker);
    void returnTheCoin(CoffeeMaker coffeeMaker);
}
