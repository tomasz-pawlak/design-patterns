//Popularny. Wydzielenie zachowania z klasy. Rozdzielenie zachowania na klasie kontekstowej. Klasa główna nie musi znać
//wszystkiego, wystarczy, ze wykona strategie. Istotne: ustawienie podsczas runtime app(w czasie działąnia) - mozna zmieniac w kazdej chwilii,
//Elastyka


import calculator.PriceCalculator;
import calculator.SalePrice;

public class main {
    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.setPricingStrategy(new SalePrice());

        priceCalculator.calculate(50, true);


    }


}

