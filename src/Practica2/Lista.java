package Practica2;

public class Lista {
    Nodo primero;

    public Lista() {
        this.primero = null;
    }

    public Lista agregarCabezaLista(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setEnlace(primero);
        primero = nuevo;
        return this;
    }

    public Lista agregarNodoLista(int dato, int nuevoDato) {
        Nodo nuevo, anterior;
        anterior = buscarLista(dato);
        if (anterior != null) {
            nuevo = new Nodo(nuevoDato);
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }

    public Lista agregarFinal(int dato) {

        Nodo indice, ultimo;

        indice = primero;
        if (indice != null) {
            while (indice.getEnlace() != null) {
                indice = indice.getEnlace();
            }
            ultimo = new Nodo(dato);
            indice.setEnlace(ultimo);
        }

        return this;
    }

    public Nodo buscarLista(int dato) {
        Nodo i;

        for (i = primero; i != null; i = i.getEnlace()) {
            if (dato == i.getDato()) {
                return i;
            }

        }

        return null;
    }

    public void eliminarNodo(int dato) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;

        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.getDato() == dato);
            if (!encontrado) {
                anterior = actual;
                actual = actual.getEnlace();
            }
        }
        if (actual != null) {
            if (actual == primero) {
                primero = actual.getEnlace();
            } else {
                anterior.setEnlace(actual.getEnlace());
            }
            actual = null;
        }
    }

    public void visualiza() {
        Nodo n = primero;

        while (n != null) {
            System.out.println("Dato:" + n.getDato() + "\tEnlace:" + n.getEnlace());
            n = n.getEnlace();
        }
    }
}
