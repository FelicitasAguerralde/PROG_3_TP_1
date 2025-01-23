package Ej_1_Lista_vinculable_y_pila;

public class Node <T>{

    private T info;
    private Node<T> next;

    // Se inicializa nulo
    public Node(){
        this.info = null;
        this.next = null;
    }

    // Setea el valor del nodo y el siguiente
    public Node(T info, Node<T> next){
        this.setInfo(info);
        this.setNext(next);
    }

    public void setInfo(T info){
        this.info = info;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public T getInfo(){
        return this.info;
    }

    public Node<T> getNext(){
        return this.next;
    }
}
