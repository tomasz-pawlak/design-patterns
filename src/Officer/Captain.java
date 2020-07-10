package Officer;

import Message.Message;

public class Captain extends Officer {

    private static final int CODE = 50;
    private static final String name = "Kałasznikow";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.CAPTAIN) && message.getCode()==CODE){
            System.out.println(name +"Kapitan czyta wiadomosc "+message.getContent());
        }else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
