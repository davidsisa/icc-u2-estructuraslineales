
import materia.models.Pantalla;
import materia.queues.Queue;
import materia.queues.QueueGeneric;
import materia.stacks.StackGeneric;
import materia.stacks.Stacks;

public class App {

    public static void main(String[] args) throws Exception {
        //runStack();
        //runStackGeneric();
        runQueue();
        
    }

    public static void runStack() {
        Stacks stack = new Stacks();
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);
        System.out.println("cima    --> " + stack.peek() + " nodo en la cima");
        System.out.println("retirar --> " + stack.pop() + " se retira nodo");
        System.out.println("cima    --> " + stack.peek() + " nodo en la cima");
        System.out.println("retirar --> " + stack.pop() + " se retira nodo");
        System.out.println("cima    --> " + stack.peek() + " nodo en la cima");
        System.out.println("retirar --> " + stack.pop() + " se retira nodo");
        System.out.println("cima    --> " + stack.peek() + " nodo en la cima");

    }

    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));
        System.out.println("Estoy en " + router.peek().getRuta());
        System.out.println("Regreso a " + router.popNode().getNext().getValue().getRuta());


    }
    public static void runQueue() {
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
    }
    public static void runQueueGeneric(){
        QueueGeneric<String> cola = new QueueGeneric();
        cola.enqueue("Numero Uno");
        cola.enqueue("Numero Dos");
        cola.enqueue("Numero Tres");
        System.out.println(cola.peek());
        System.out.println(cola.size());
    }
}
