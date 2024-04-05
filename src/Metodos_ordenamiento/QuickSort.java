package Metodos_ordenamiento;

public class QuickSort { //No requiere memoria adicional pero es menos eficiente que mergesort

    private int[] numbers;

    public void sort(int[] values) {
        // Asignar el arreglo a ordenar a la variable "numbers"
        this.numbers = values;

        // Iniciar el ordenamiento recursivo desde el primer elemento hasta el último
        quickSort(0, numbers.length - 1);
    }

    private void quickSort(int low, int high) {
        // Caso base: Si el índice inicial es menor o igual al índice final, el arreglo ya está ordenado
        if (low < high) {

            // Elegir un elemento pivote
            int pivot = numbers[high];

            // Particionar el arreglo alrededor del pivote
            int partitionIndex = partition(low, high, pivot);

            // Ordenar recursivamente la mitad izquierda del arreglo
            quickSort(low, partitionIndex - 1);

            // Ordenar recursivamente la mitad derecha del arreglo
            quickSort(partitionIndex + 1, high);
        }
    }

    private int partition(int low, int high, int pivot) {
        // Posición del elemento que será comparado con el pivote
        int i = low - 1;

        // Recorrer el arreglo desde el siguiente elemento al pivote hasta el último
        for (int j = low; j < high; j++) {

            // Si el elemento actual es menor que el pivote
            if (numbers[j] <= pivot) {

                // Incrementar la posición del elemento que será comparado con el pivote
                i++;

                // Intercambiar el elemento actual con el elemento en la posición "i"
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        // Intercambiar el pivote con el elemento en la posición "i + 1"
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;

        // Retornar la posición del pivote después de ser intercambiado
        return i + 1;
    }
}

