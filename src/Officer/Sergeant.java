package Officer;

import Message.Message;

public class Sergeant extends Officer {

    static final int CODE= 10;
    static final String name = "Kozłowski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGEANT) && message.getCode()==10){
            System.out.println(name+"Sierżant kowalski czyta wiadomosc: "+message.getContent());
        }else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
