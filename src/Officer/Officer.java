package Officer;

import Message.Message;

public abstract class Officer {

    private Officer superiorOfficer;

    public void processMessage(Message message){

    }

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }
}
