package Practica7;

public class Nodo {
    Object dato;
    Nodo izq;
    Nodo der;

    Nodo(Object dato) {
        this.dato = dato;
        izq = null;
        der = null;
    }

    Nodo(Nodo izq, Object dato, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    Object getDato() {
        return dato;
    }

    Nodo subArbolIzq() {
        return izq;
    }

    Nodo subArbolDer() {
        return der;
    }

    void nuevoValor(Object dato) {
        this.dato = dato;
    }

    void ramaIzq(Nodo n) {
        this.izq = n;
    }

    void ramaDer(Nodo n) {
        this.der = n;
    }


    public void mostrarPreOrden() {
        System.out.println(dato);

        if (izq != null) {
            izq.mostrarPreOrden();
        }

        if (der != null) {
            der.mostrarPreOrden();
        }


    }

    public void mostrarInOrden() {

        if (izq != null) {
            izq.mostrarInOrden();
        }

        System.out.println(dato);

        if (der != null) {
            der.mostrarInOrden();
        }
    }

    public void mostrarPostOrden() {

        if (izq != null) {
            izq.mostrarPostOrden();
        }

        if (der != null) {
            der.mostrarPostOrden();
        }

        System.out.println(dato);
    }
}
