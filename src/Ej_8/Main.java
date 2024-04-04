package Ej_8;


public class Main {
    public static void main(String[] args) {

        //Lista:
        System.out.println("---------------------Lista--------------------- \b");
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // Insertar elementos al frente de la lista
        list.insertFront(3);
        list.insertFront(2);
        list.insertFront(1);

        // Insertar elementos al final de la lista
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        // Imprimir la lista
        System.out.println("Lista doblemente vinculada: " + list.toString());
        System.out.println("La lista mide: "+list.getSize());
        System.out.println("La lista está vacía: "+list.isEmpty()); // false
        System.out.println("El primer elemento de la lista es:"+list.get(0));
        //System.out.println("Elimino el primer elemento: "+list.extractFront());
        //System.out.println("La lista queda: "+list);

    }
}
