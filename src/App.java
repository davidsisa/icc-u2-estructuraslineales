import materia.stacks.Stacks;

public class App {
    
    public static void main(String[] args) throws Exception {
        runStack();
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
        
    }
}
