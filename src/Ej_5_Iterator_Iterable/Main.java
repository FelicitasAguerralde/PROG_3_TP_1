package Ej_5_Iterator_Iterable;

public class Main {
    public static void main(String[] args) {

        //Lista:
        System.out.println("---------------------Lista--------------------- \b");
        List<Integer> list = new List<>();
        list.insertFront(2);
        list.insertFront(4);
        list.insertFront(6);
        list.insertFront(8);

        /*Iterator<Integer> iterator = list.iterator(); //Declaro un iterator
        while(iterator.hasNext()){ //Mientras tenga un siguiente
            Integer i = iterator.next(); //pido el siguiente
            System.out.println(i);
        }*/

        //Una vez implementado mi iterator, puedo recorrer la lista como si fuera un array
        for(int i : list){
            System.out.println(i);
        }


    }
}
