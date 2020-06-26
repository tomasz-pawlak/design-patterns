import Units.Grunt;
import Units.Shaman;
import Units.WitchDoctor;

import java.util.ArrayList;
import java.util.List;

public class main {

    //Pyłek używany jest aby odciążyć pamięć, przy tworzeniu dużej ilości obiektów
    //wyodrębnienie części wspólnej dla tych miliona obiektów do 1 pojedynczego obiektu i wspoldzieleniue miedzy innymi
    //czy wogole warto? wiecej pracy niz pozytku
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();

        for (int i =0; i<1000000;i++){
            objects.add(new Shaman(0,0));
            objects.add(new Grunt(5,5));
            objects.add(new WitchDoctor(10,10));
        }

    }
}
