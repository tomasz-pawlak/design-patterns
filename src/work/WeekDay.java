package work;

public abstract class WeekDay {

    public final void sameDay(TypeOfTransport typeOfTransport){
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        work();
        goHome();
    }

    private void wakeUp(){
        System.out.println("Wstaje rano");
    }

    private void getReady(){
        System.out.println("myje sie");
    }

    protected abstract void work();

    protected abstract int goToWork(TypeOfTransport typeOfTransport);

    private void goHome(){
        System.out.println("wracam do domu");
    }
}
