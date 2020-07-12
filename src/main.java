//Popularny. Wydzielenie zachowania z klasy. Rozdzielenie zachowania na klasie kontekstowej. Klasa główna nie musi znać
//wszystkiego, wystarczy, ze wykona strategie. Istotne: ustawienie podsczas runtime app(w czasie działąnia) - mozna zmieniac w kazdej chwilii,
//Elastyka


import eggCoocker.Chef;
import eggCoocker.HardBoiledEggCooker;

public class main {
    public static void main(String[] args) {

        Chef chef = new Chef("Mateusz");
        chef.setEggCooker(new HardBoiledEggCooker());

        chef.cook();
    }


}

