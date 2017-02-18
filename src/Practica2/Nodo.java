package Practica2;

public class Nodo {
    private int dato;
    private Nodo enlace; //Enlace al siguiente nodo,

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    private int indice;

    public Nodo(int x) {
        dato = x;
        enlace = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
