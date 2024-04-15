package Ej_10_Ordenado;

public class Ordenado_recursion {

    public boolean estaOrdenado(int[] arreglo, int inicio, int fin) {
        if (inicio == fin) {
            return true;
        }

        if (arreglo[inicio] > arreglo[fin]) {
            return false;
        }

        return estaOrdenado(arreglo, inicio + 1, fin) && estaOrdenado(arreglo, inicio, fin - 1);
    }
}
