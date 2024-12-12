package Ejercicio_02_sorting.Pilas;

public class OrdenarStacks {

    public void ordenarPilas(MetodoStacks<Integer> pila){
        MetodoStacks<Integer> pilaAux = new MetodoStacks<>();
        while (!pila.vacio()) { 
            int aux = pila.eliminar();
            while (!pilaAux.vacio() && pilaAux.obtener() > aux) {
                pila.insercion(pilaAux.eliminar());
            }
            pilaAux.insercion(aux);
        }
        while (!pilaAux.vacio()) {
            pila.insercion(pilaAux.eliminar());
        }
    }
}
