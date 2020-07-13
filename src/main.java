//poprawia czytelnosc kodu i umozliwia testy jednostkowe. Warto trzymac w paczce. Porównowany ze strategia


import state.CoffeeMaker;

public class main {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.insertTheCoin();
        coffeeMaker.pushTheButton();
        coffeeMaker.takeTheCup();
    }


}

