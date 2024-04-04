package Ej_6_Elementos_iguales_con_listas_ordenadas;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------Listas--------------------- \b");
        List<Integer> list1 = new List<>();
        list1.insertFront(1);
        list1.insertFront(2);
        list1.insertFront(4);
        list1.insertFront(6);

        List<Integer> list2 = new List<>();
        list2.insertFront(1);
        list2.insertFront(2);
        list2.insertFront(7);
        list2.insertFront(9);

        // Imprime las listas originales
        System.out.println("Lista 1: " + list1);
        System.out.println("Lista 2: " + list2);


        //Elemento salida
        List<Integer> salida = new List<>();

        MyIterator<Integer> it1 = (MyIterator<Integer>) list1.iterator();
        MyIterator<Integer> it2 = (MyIterator<Integer>) list2.iterator();


        while(it1.hasNext() && it2.hasNext()){
            Integer val1 = it1.get();
            Integer val2 = it2.get();
            //Itero siempre con el menor
            if(val1<val2){
                it1.next();
            }
            //Si son iguales avanzo con ambos
            else if(val1==val2){
                salida.insertFront(val2);
                it1.next();
                it2.next();

            }
            else{
                it2.next();
            }

            //Mientras me hayan quedado elementos en la primer lista
            while(it1.hasNext()){
                Integer val = it1.next();
                salida.insertFront(val);
            }
        }


        System.out.println("La lista con elementos iguales es: "+salida);

    }

}
