package state;

public class CupFullState implements State {
    @Override
    public void insertTheCoin(CoffeeMaker coffeeMaker) {
        System.out.println("Zabierz kubek");
    }

    @Override
    public void pushTheButton(CoffeeMaker coffeeMaker) {
        System.out.println("Zbierz najpierw kubek");
    }

    @Override
    public void takeTheCup(CoffeeMaker coffeeMaker) {
        System.out.println("Zabrano kubek");
        coffeeMaker.state = new NoCoinState();
    }

    @Override
    public void returnTheCoin(CoffeeMaker coffeeMaker) {
        System.out.println("Za pozno");
    }
}
