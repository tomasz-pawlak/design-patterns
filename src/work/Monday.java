package work;

public class Monday extends WeekDay {
    @Override
    protected void work() {
        System.out.println("Pracuje w pocie czoła");
    }

    @Override
    protected int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport){
            case CAR:
                System.out.println(10);
                return 10;
            case BIKE:
                System.out.println(25);
                return 25;
            case TRAM:
                System.out.println(15);
                return 15;
            default:
                System.out.println(20);
                return 20;
        }
    }
}
