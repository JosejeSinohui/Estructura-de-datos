package Practica3;

import Practica2.Lista;

public class PilaLista {
    Lista stackList;

    PilaLista() {
        stackList = new Lista();
    }

    PilaLista push(int dato) {
        stackList.agregarCabezaLista(dato);
        return this;
    }

    int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return 1;
        }
        int first = stackList.primero.getDato();
        stackList.borrarPrimero();
        return first;
    }

    void visualize() {
        stackList.visualiza();
    }

    boolean isEmpty() {
        return stackList.primero == null;
    }

}
