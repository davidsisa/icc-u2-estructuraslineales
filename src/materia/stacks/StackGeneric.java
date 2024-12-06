package materia.stacks;
import java.util.EmptyStackException;

import materia.models.NodeGeneric;
public class StackGeneric <T> {
    private NodeGeneric<T> top;
    private int size;

    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    public void push(T data) {
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top);
        top = newNode;  // Aquí es necesario actualizar el top con el nuevo nodo
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public NodeGeneric<T> popNode() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        NodeGeneric<T> node = top;
        top = top.getNext();
        size--;
        return node;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
