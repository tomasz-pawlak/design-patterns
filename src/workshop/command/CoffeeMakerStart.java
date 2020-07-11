package workshop.command;

import workshop.CoffeeMaker;

public class CoffeeMakerStart implements Command {
    private CoffeeMaker coffeeMaker;

    public CoffeeMakerStart(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.start();
    }
}
