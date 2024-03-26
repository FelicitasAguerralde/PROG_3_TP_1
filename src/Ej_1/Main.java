package Ej_1;

public class Main {
    public static void main(String[] args) {
        List<String> list = new List<>();
        list.insertFront("Feli");
        list.insertFront("Seba");
        System.out.println(list); //
        System.out.println("La lista mide: "+list.getSize());
        System.out.println("La lista está vacía: "+list.isEmpty()); // false
        System.out.println("El primer elemento de la lista es:"+list.get(0));
        System.out.println("Elimino el primer elemento: "+list.extractFront());
        System.out.println("La lista queda: "+list);
    }
}
