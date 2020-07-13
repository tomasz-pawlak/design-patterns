package state;

public class NoCoinState implements State {

    @Override
    public void insertTheCoin(CoffeeMaker coffeeMaker) {
        System.out.println("Moneta została wrzucona");
        coffeeMaker.state = new CoinInState();
    }

    @Override
    public void pushTheButton(CoffeeMaker coffeeMaker) {
        System.out.println("Wrzuc monete");
    }

    @Override
    public void takeTheCup(CoffeeMaker coffeeMaker) {
        System.out.println("Wrzuc monete");
    }

    @Override
    public void returnTheCoin(CoffeeMaker coffeeMaker) {
        System.out.println("Wrzuc monete");
    }
}
