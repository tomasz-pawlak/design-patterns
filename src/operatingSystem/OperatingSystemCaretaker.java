package operatingSystem;

public class OperatingSystemCaretaker {
    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Dodano wersje: " + operatingSystemMemento.getBackupNumber() + " z dnia: " + operatingSystemMemento.getBackupDate());
        this.operatingSystemMemento = operatingSystemMemento;
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Wczytano wersje: " + operatingSystemMemento.getBackupNumber() + " z dnia: " + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }
}
