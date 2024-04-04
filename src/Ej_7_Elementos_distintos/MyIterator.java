package Ej_7_Elementos_distintos;


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

    //Agrego un metodo get que permita que al obtener el next no avance el cursor
    public T get(){
        return this.cursor.getInfo();
    }
}
