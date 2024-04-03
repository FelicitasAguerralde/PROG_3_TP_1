package Ej_6;

import Ej_6.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------Listas--------------------- \b");
        List<Integer> list1 = new List<>();
        list1.insertFront(1);
        list1.insertFront(7);
        list1.insertFront(9);
        list1.insertFront(3);

        List<Integer> list2 = new List<>();
        list2.insertFront(1);
        list2.insertFront(2);
        list2.insertFront(7);
        list2.insertFront(5);

        // Imprime las listas originales
        System.out.println("Lista 1: " + list1);
        System.out.println("Lista 2: " + list2);

        // Imprime la lista con la diferencia
        System.out.println("Igualdad: " + list1.isEqual(list1, list2));
    }
}
