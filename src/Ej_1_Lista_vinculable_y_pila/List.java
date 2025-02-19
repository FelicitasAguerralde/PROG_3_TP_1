package Ej_1_Lista_vinculable_y_pila;

public class List<T> {

    private Node<T> first;
    private int size;

    // Se inicializan los atributos
    public List() {
        this.first = null;
        this.size = 0;
    }

    // Insertar un elemento al frente de la lista
    public void insertFront(T info) {
        Node<T> newNodo = new Node<T>(info, null); // Se crea un nuevo nodo con el dato y sin siguiente
        newNodo.setNext(this.first); // Se apunta al nuevo nodo al nodo que era el primero
        this.first = newNodo; // El nuevo nodo se convierte en el primero de la lista
        size++; // Se incrementa el tamaño de la lista
    }

    // Extraer un elemento del frente de la lista
    public T extractFront() {
        if (isEmpty()) {
            return null;
        }
        // Se guarda la info a borrar para poder devolverla
        T dato = first.getInfo();

        // El primero apunta al siguiente
        first = first.getNext();

        // Se actualiza el tamaño de la lista
        size--;

        return dato;
    }


    // Obtener tamaño de la lista
    public int getSize() {
        return size;
    }

    //Size
    public boolean isEmpty() {
        return size == 0;
    }

    //Obtiene el elemento en la posición indicada
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getInfo();
    }

    //Retornar la posicion del elemento pasado por parámetro
    public int indexOf(T info){
        Node<T> current = first;
        for(int i=0; i<this.size; i++){
            if(current.getInfo().equals(info)){
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    //String
    // Devuelve una representación String de la lista
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = first;
        while (current != null) {
            sb.append(current.getInfo()).append(", ");
            current = current.getNext();
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
