package Ej_5_Iterator_Iterable;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> { //Implementa la interfaz Iterator de Java

    //Atributos
    private Node<T> cursor;

    //Constructor
    public MyIterator(Node<T> cursor){
        this.cursor = cursor;
    }

    @Override
    public boolean hasNext() { //Devuelve si hay siguiente
        return cursor!=null;
    }

    @Override
    public T next() {
        T info = this.cursor.getInfo(); //Guardo la info del cursor
        //Pido el siguiente del cursor
        this.cursor = this.cursor.getNext();
        return info; //Devuelvo la info del cursor
    }
}
