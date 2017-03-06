package Practica3;

public class Principal {

    public static void main(String[] args) {

        PilaLista pila = new PilaLista();

        pila.push(20).push(30).push(50).push(10);
        pila.visualize();
        System.out.println(pila.pop());
        pila.visualize();

    }
}
