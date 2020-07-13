package state;

public class CoffeeMaker {

    State state;

    public CoffeeMaker() {
        state = new NoCoinState();
    }

    public void insertTheCoin(){
        state.insertTheCoin(this);
    }

    public void pushTheButton(){
        state.pushTheButton(this);
    }

    public void takeTheCup(){
        state.takeTheCup(this);
    }

    public void returnTheCoin(){
        state.returnTheCoin(this);
    }
}
