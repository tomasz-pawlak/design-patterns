import template.AutomatCarStartingSequence;
import template.CarStartingSequence;
import template.ClassicCarStartingSequence;
import work.Monday;
import work.TypeOfTransport;
import work.WeekDay;

//Bardzo popularny w Springu, jdbc template, np resttemplate (ogolnie template). Minus to ze clase mozna extande tylko 1
// klase, ale nie mozna zrobic tego w interface - bo uzytkownik moze podmnienic metody, ktorych nie chcemy
public class main {
    public static void main(String[] args) {

        WeekDay weekDay = new Monday();

        weekDay.sameDay(TypeOfTransport.CAR);
    }


}

