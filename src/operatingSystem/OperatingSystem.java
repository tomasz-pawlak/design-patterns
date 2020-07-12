package operatingSystem;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber =0;
    private Date backupDate;

    public void createBackup(){
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Backup nr: "+this.backupNumber+" utworzony: "+this.backupDate);
    }

    public OperatingSystemMemento save(){
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    };

    public void load(OperatingSystemMemento memento){};
}
