package Practica4;

import Practica2.Lista;

/**
 * Created by joseje on 3/8/17.
 */
public class LinkedQueue {

    Lista queueList;

    LinkedQueue() {
        queueList = new Lista();
    }

    void insert(int x) {
        queueList.agregarCabezaLista(x);
    }

    int exctract() {

        int dato = 0;

        if (isEmpty()) {
            System.out.println("The queue is empty");
            return dato;
        } else {
            dato = queueList.ultimoDato();
            queueList.borrarUltimo();
        }

        return dato;

    }

    void visualize() {
        queueList.visualiza();
    }

    boolean isEmpty() {
        return queueList.primero == null;
    }
}
