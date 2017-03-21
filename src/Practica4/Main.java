package Practica4;

public class Main {

    public static void main(String[] args) {

        LinkedQueue cola = new LinkedQueue();

        cola.insert(20);
        cola.insert(12);
        cola.insert(13);
        cola.insert(14);
        cola.visualize();
        System.out.println(cola.exctract());
        cola.visualize();

    }
}
