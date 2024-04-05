package Metodos_ordenamiento;

public class Mergesort { //Requiere una memoria auxiliar adicional

    // Declaración de variables
    private int[] numbers; // Arreglo que contiene los números a ordenar
    private int[] helper; // Arreglo auxiliar utilizado para la mezcla
    private int size; // Tamaño del arreglo

    // Método para ordenar el arreglo
    public void sort(int[] values) {

        // Asignar el arreglo a ordenar a la variable "numbers"
        this.numbers = values;

        // Obtener el tamaño del arreglo
        size = values.length;

        // Crear un nuevo arreglo auxiliar del mismo tamaño que "numbers"
        this.helper = new int[size];

        // Iniciar el ordenamiento recursivo desde el primer elemento hasta el último
        mergesort(0, size - 1);
    }

    // Método recursivo para ordenar por mezcla
    private void mergesort(int low, int high) {

        // Caso base: Si el índice inicial es menor o igual al índice final, el arreglo ya está ordenado
        if (low < high) {

            // Calcular el índice del elemento central del arreglo
            int middle = (low + high) / 2;

            // Ordenar recursivamente la mitad izquierda del arreglo
            mergesort(low, middle);

            // Ordenar recursivamente la mitad derecha del arreglo
            mergesort(middle + 1, high);

            // Combinar las dos mitades ordenadas en un solo arreglo
            merge(low, middle, high);
        }
    }

    // Método para combinar dos mitades ordenadas en un solo arreglo
    private void merge(int low, int middle, int high) {

        // Copiar ambas mitades del arreglo "numbers" al arreglo auxiliar "helper"
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        // Índices para recorrer las dos mitades y el arreglo original
        int i = low;
        int j = middle + 1;
        int k = low;

        // Comparar y copiar los elementos de las dos mitades al arreglo original de forma ordenada
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de la mitad izquierda (si los hay) al arreglo original
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

        // Copiar los elementos restantes de la mitad derecha (si los hay) al arreglo original
        while (j <= high) {
            numbers[k] = helper[j];
            k++;
            j++;
        }
    }
}
