package Ejercicio_02_sorting.Models;

public class Nodo <T>{

    private T valor;

    private Nodo<T> next;
    
    
    public Nodo(T valor) {
        this.valor = valor;
        this.next = null;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
    public Nodo<T> getNext() {
        return next;
    }
    public void setNext(Nodo<T> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "Nodo [valor=" + valor + "]";
    }
    
}
