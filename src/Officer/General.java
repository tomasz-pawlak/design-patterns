package Officer;

import Message.Message;

public class General extends Officer {

    private static final int CODE = 9000;
    private static final String NAME = "Napoleon";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL) && message.getCode()==CODE){
            System.out.println(NAME +"General czyta wiadomosc "+message.getContent());
        }else {
            System.out.println("Nie przeczytano wiadomosci");
        }
    }
}
