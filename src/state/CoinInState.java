package state;

public class CoinInState implements State {
    @Override
    public void insertTheCoin(CoffeeMaker coffeeMaker) {
        System.out.println("Moneta juz wrzucona");
    }

    @Override
    public void pushTheButton(CoffeeMaker coffeeMaker) {
        System.out.println("Nalewam kawe");
        coffeeMaker.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeeMaker coffeeMaker) {
        System.out.println("Wcisnij button");
    }

    @Override
    public void returnTheCoin(CoffeeMaker coffeeMaker) {
        System.out.println("Zwracam monete");
        coffeeMaker.state = new NoCoinState();
    }
}
