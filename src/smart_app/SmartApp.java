package smart_app;

public class SmartApp {
    private Double version;

    public void changeVersion(Double version){
        this.version = version;
        System.out.println("Zapisano wersje: "+version);
    }

    public SmartAppMemento save(){
        return new SmartAppMemento(this.version);
    }

    public void load(SmartAppMemento memento){
        this.version = memento.getVersion();
    }
}
