package Ej_10_Ordenado;

public class Ordenado_recursion {

    public static boolean estaOrdenado(int[] arreglo, int n) {
        return arreglo[n - 1] >= arreglo[n - 2] &&
                estaOrdenado(arreglo, n - 1);
    }
}
