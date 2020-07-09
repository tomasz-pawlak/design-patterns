import adapters.*;

//Największa wada, że dodaje nowy poziom abstrakcji. Przenoszenie z jednego interface do drugiego. Przepusywanie dużej ilości kodu.
public class main {
    public static void main(String[] args) {

        ContinentalSocket continentalSocket = new ContinentalSocket();

        UKSocket ukSocket = new UKSocket();

        UKDevice ukDevice = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("You'll never Walk Alone");
            }
        };

        ContinentalDevice continentalDevice = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("JAJA Ding Dong");
            }
        };

        UkToContinentalAdapter ukToContinentalAdapter = new UkToContinentalAdapter(ukDevice);

        continentalSocket.plugin(continentalDevice);
        ukSocket.plugIn(ukDevice);

        ukToContinentalAdapter.on();

    }
}

