package materia.stacks;
import java.util.EmptyStackException;
import materia.models.NodeU;




public class Stacks {
    private NodeU top;
    public Stacks(){
        this.top=null;
        
    }
    public void push(int value){
        NodeU newNode = new NodeU(value);
        newNode.setNext(top);
        top  = newNode; 
    }  
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int peek(){
        if(isEmpty()){
                throw new EmptyStackException();
        }
        return top.getValue();
    }
    public void printStacks(){
        NodeU aux=top;
        while (aux != null){
            System.out.println(aux.getValue());
            aux=aux.getNext();
        }
    }
    public int getSize(){
        int size = 0;
        NodeU current = top;
        while(current!= null){
            size++;
            current=current.getNext();
        } 
        return size;
    }
}
