import Flight.FlightLeg;

public class main {

    public static void main(String[] args) {

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();

        System.out.println(leg);


    }


}
