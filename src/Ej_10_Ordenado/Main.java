package Ej_10_Ordenado;

public class Main {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};

        Ordenado_recursion ordenado = new Ordenado_recursion();

        System.out.println(ordenado.estaOrdenado(arreglo, 0, arreglo.length - 1)); // Imprime true

    }
}