package adapters;

public class UkToContinentalAdapter {
    UKDevice ukDevice;

    public UkToContinentalAdapter(UKDevice ukDevice) {
        this.ukDevice = ukDevice;
    }

    public void on(){
        ukDevice.powerOn();
    }
}
