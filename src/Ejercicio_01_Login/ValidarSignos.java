package Ejercicio_01_Login;
import Ejercicio_02_sorting.Pilas.MetodoStacks;
public class ValidarSignos {
    public boolean isValid(String s){
        MetodoStacks<Character> pila = new MetodoStacks<>();
        char[] cadena = s.toCharArray();
        for (char c: cadena) {
            if (c == '(' || c == '[' || c == '{') {
                pila.insercion(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (pila.vacio()) {
                    return false;
                }
                char apertura = pila.eliminar();

                if ((c == ')' && apertura != '(') || (c == ']' && apertura != '[') ||(c == '}' && apertura != '{')) {
                    return false;
                }
            }

        }
        return pila.vacio();
    }
}
