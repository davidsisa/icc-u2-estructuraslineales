package materia.stacks;
import java.util.EmptyStackException;

import materia.models.NodeGeneric;
public class StackGeneric <T> {
    private NodeGeneric <T> top;
    private int size;
    public StackGeneric(){
        this.top = null;
        this.size = 0;
    }
    public void push(T data){
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top);
        size ++;
    }
    public T pop(){
        if(isEmpy()){
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size --;

        return value;
    }
    public T peek(){
        if(isEmpy()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }
    public boolean isEmpy(){
        return top == null;
    }
}
