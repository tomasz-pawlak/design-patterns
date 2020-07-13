package visitor;

import activity.Squash;
import activity.Treadmill;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Bieganjac spaliles kalorii: "+treadmill.getDistance()*5);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Grajac w squasha spaliles kalorii: "+squash.getMinutesPlayed()*20);
    }
}
