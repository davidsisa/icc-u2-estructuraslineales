package Ejercicio_02_sorting.Pilas;
import Ejercicio_02_sorting.Models.Nodo;
import java.util.EmptyStackException;

public class MetodoStacks<T> {

    private Nodo<T> top;
    private int size;

    public MetodoStacks(){
        this.top = null;
        size = 0;
        
    }
    public void insercion(T valor){
        Nodo<T> nuevoNodo  = new Nodo<>(valor);
        nuevoNodo.setNext(top);
        top  = nuevoNodo;
        size ++;
    }

    public T eliminar(){
        if (vacio()) {
            throw new EmptyStackException();
        }
        T valor = top.getValor();
        top = top.getNext();
        size --;
        return valor;

    }
    public T obtener(){
        if (vacio()) {
            throw new EmptyStackException();
        }
        return top.getValor();
    }
    public int size(){
        return size;
    }
    public boolean vacio(){
        return top == null;
    }
    public void mostrar(){
         Nodo<T> aux = top;
         while (aux != null){
            System.out.print("  "+aux.getValor());
            aux = aux.getNext();
        } 
    }

}
