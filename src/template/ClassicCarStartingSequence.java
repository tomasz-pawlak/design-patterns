package template;

public class ClassicCarStartingSequence extends CarStartingSequence {
    @Override
    public void skrzyniaBiegow() {
        System.out.println("manualna skrzynia biegów");
    }

    @Override
    public void uruchomAuto() {
        System.out.println("przekrecam kluczyk");
    }
}
