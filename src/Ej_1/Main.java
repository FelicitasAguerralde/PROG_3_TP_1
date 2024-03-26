package Ej_1;

public class Main {
    public static void main(String[] args) {

        //Lista:
        System.out.println("---------------------Lista--------------------- \b");
        List<String> list = new List<>();
        list.insertFront("Feli");
        list.insertFront("Seba");
        System.out.println(list); //
        System.out.println("La lista mide: "+list.getSize());
        System.out.println("La lista está vacía: "+list.isEmpty()); // false
        System.out.println("El primer elemento de la lista es:"+list.get(0));
        System.out.println("Elimino el primer elemento: "+list.extractFront());
        System.out.println("La lista queda: "+list);

        //Pila
        System.out.println("---------------------Pila--------------------- \b");
        Pila<String> pila = new Pila<>();
        pila.push("Primer elemento");
        pila.push("Segundo elemento");
        pila.push("Tercer elemento");
        System.out.println("La pila es: \b"+pila);
        System.out.println("El tamaño de la pila es: "+pila.size());
        System.out.println("La pila está vacía: "+pila.isEmpty());
        System.out.println("El elemento de arriba de la pila es: "+pila.top());
        System.out.println("Extraigo el elemento de la pila: "+pila.pop());
        System.out.println("La pila queda: "+pila);
        pila.reverse();
        System.out.println("La pila revertida: \b"+pila);

        System.out.println("---------------------Lista IndexOf--------------------- \b");
        //IndexOf Lista
        System.out.println(list.indexOf("Feli"));
    }
}
