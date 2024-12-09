package Models;
public class LinkedList <T>{
    private Node<T> head;
    private int size = 0;

    public void appendToTall(T value){
        if(head == null){
            head = new Node<>(value);
        }else {
            Node<T> current = head;
            while (current.getNext() != null) { 
                current = current.getNext();
            }
            current.setNext(new Node<>(value));
        }
        size++;
    }
    public void print(){
        if(head == null){
            System.out.println("END");
            return;
        }
        Node<T> current = head;
        while(current.getNext()!=null){
            System.out.println(current.getValue() + "--->");
        }
        System.out.println("END");
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
