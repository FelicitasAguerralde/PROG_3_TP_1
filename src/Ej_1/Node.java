package Ej_1;

public class Node <T>{

    //Atributos
    private T info;
    private Node<T> next;

    //Constructor
    public Node(){
        this.info = null; //Incializamos nulo
        this.next = null;
    }

    //Constructor con parametros
    public Node(T info, Node<T> next){
        this.setInfo(info); //Incializamos nulo
        this.setNext(next);
    }

    //Getter and Setters

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
