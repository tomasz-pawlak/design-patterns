package workshop.command;

import workshop.CoffeeMaker;

public class CoffeeMakerStop implements Command {
    private CoffeeMaker coffeeMaker;

    public CoffeeMakerStop(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.stop();
    }
}
