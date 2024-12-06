package materia.models;

public class NodeU {

    private int value;
    private NodeU next;

    public NodeU(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeU getNext() {
        return next;
    }

    public void setNext(NodeU next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "node [value = " + value + "]";
    }
}
