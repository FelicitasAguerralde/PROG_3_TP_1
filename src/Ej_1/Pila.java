package Ej_1;

public class Pila <T>{

    //Atributos
    private List<T> list;

    //Constructor
    public Pila(){
        this.list = new List<>();
    }

    //Agregar
    public void push(T info){
        list.insertFront(info);
    }

    //Eliminar elemento y retornarlo. En la pila siempre se elimina desde arriba
    public T pop(){
        return list.extractFront();
    }

    //Retornar el primer elemento de la pila
    public T top(){
        return list.get(0);
    }

    //Invertir el orden de los elementos de la pila, yo lo hice manteniendo la original
    public void reverse(){
        List<T> listReverse = new List<>();
        while(!this.list.isEmpty()){
            listReverse.insertFront(this.list.extractFront());
        }
        this.list = listReverse;
    }

    // Indica si la pila está vacía
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Devuelve el tamaño de la pila
    public int size() {
        return list.getSize();
    }

    // Devuelve una representación String de la pila
    @Override
    public String toString() {
        return list.toString();
    }


}
