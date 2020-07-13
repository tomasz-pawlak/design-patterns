package activity;

import visitor.TransportVisitor;

public interface Transportable {
    void accept(TransportVisitor transportVisitor);
}
