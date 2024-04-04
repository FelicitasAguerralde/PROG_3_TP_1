package Ej_8;

public class Node<T> {
    //Atributos
    private T info;
    private Node<T> previous;
    private Node<T> next;

    //Constructor sin parametro
    public Node(){
        this.info=null;
        this.previous=null;
        this.next=null;
    }

    //Constructor con parametros
    public Node(T info, Node<T> previous, Node<T> next){
        this.setInfo(info);
        this.setPrevious(previous);
        this.setNext(next);
    }

    //Getters and Setters
    public void setInfo(T info){
        this.info=info;
    }

    public T getInfo(){
        return this.info;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
