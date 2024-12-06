import materia.models.Pantalla;
import materia.stacks.StackGeneric;
import materia.stacks.Stacks;
public class App {
    
    public static void main(String[] args) throws Exception {
        runStack();
        runStackGeneric();
    }
    public static void runStack(){
        Stacks stack= new Stacks();
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);
        System.out.println("cima    --> "+stack.peek()+" nodo en la cima");
        System.out.println("retirar --> "+stack.pop()+" se retira nodo");
        System.out.println("cima    --> "+stack.peek()+" nodo en la cima");
        System.out.println("retirar --> "+stack.pop()+" se retira nodo");
        System.out.println("cima    --> "+stack.peek()+" nodo en la cima");
        System.out.println("retirar --> "+stack.pop()+" se retira nodo");
        System.out.println("cima    --> "+stack.peek()+" nodo en la cima");

    }
    public static void runStackGeneric(){
        StackGeneric<Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1,"Home Page","/home"));
        router.push(new Pantalla(1,"Menu Page","/home/menu"));
        router.push(new Pantalla(1,"Users Page","/home/menu/users"));
        System.out.println("Estoy en " + router.peek().getRuta());

    }
}
