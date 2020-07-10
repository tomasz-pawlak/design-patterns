import Message.Message;
import Officer.Officer;
import Officer.OfficerRank;
import Officer.Sergeant;
import Officer.Captain;
import Officer.General;

//Niezbyt popularny, pozbycie sie zbyt duzej ilosci if'ow. Dobre praktyki programistyczne. Przekazywanie jakiegos zadania wyżej.
public class main {
    public static void main(String[] args) {
         Message message = new Message("Retreat!!",9000, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);
    }


}

