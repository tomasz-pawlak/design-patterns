package template;

public abstract class CarStartingSequence {

    public final void startingSequence(){
        zapnijPasy();
        skrzyniaBiegow();
        uruchomAuto();
        go();
    }


    private void zapnijPasy(){
        System.out.println("zapinam pasy");
    }

    private void go(){
        System.out.println("naciskam pedal gazu");
    }

    public abstract void skrzyniaBiegow();

    public abstract void uruchomAuto();
}
