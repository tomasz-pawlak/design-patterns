import template.AutomatCarStartingSequence;
import template.CarStartingSequence;
import template.ClassicCarStartingSequence;

//Bardzo popularny w Springu, jdbc template, np resttemplate (ogolnie template). Minus to ze clase mozna extande tylko 1
// klase, ale nie mozna zrobic tego w interface - bo uzytkownik moze podmnienic metody, ktorych nie chcemy
public class main {
    public static void main(String[] args) {
        CarStartingSequence carStartingSequence = new ClassicCarStartingSequence();

        carStartingSequence.startingSequence();

        CarStartingSequence carStartingSequence1 = new AutomatCarStartingSequence();
        carStartingSequence1.startingSequence();
    }


}

