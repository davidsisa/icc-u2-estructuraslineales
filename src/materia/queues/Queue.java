package materia.queues;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import materia.models.NodeU;
public class Queue {
    private NodeU front;
    private NodeU rear;
    public Queue(){
        this.front = null;
        this.rear = null;
    }
    public void enqueue (int value) {
        NodeU newNode = new NodeU(value);
        if(isEmpy()){
            front = newNode;
            rear = newNode;
        }else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }
    public NodeU dequeue(){
        if(isEmpy()){
            throw new NoSuchElementException();
        }
        NodeU node = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        return node;
    }   
    public NodeU peek(){
        if(isEmpy()){
            throw new NoSuchElementException();
        }
        return front;
    }
    
    public boolean isEmpy(){
        return front == null;
    }
}
