package smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {

    private List<SmartAppMemento> smartAppMementos = new ArrayList<>();

    public void addMemento(SmartAppMemento memento){
        smartAppMementos.add(memento);
        System.out.println("Zapisano wersje: "+memento.getVersion()+ " w indexie: "+(smartAppMementos.size()-1));
    }

    public SmartAppMemento getMemento(int index) {
        System.out.println("Wczytano wersje "+smartAppMementos.get(index).getVersion());
        return smartAppMementos.get(index);
    }
}
