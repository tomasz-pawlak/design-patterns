package visitor;

import activity.Squash;
import activity.Treadmill;

public interface Visitor {
    void visit(Treadmill treadmill);

    void visit(Squash squash);
}
