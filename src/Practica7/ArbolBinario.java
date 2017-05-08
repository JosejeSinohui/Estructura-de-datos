package Practica7;

public class ArbolBinario {
    Nodo raiz;
    Nodo hijoIzq;
    Nodo hijoDer;

    ArbolBinario(){
        raiz = null;
    }

    ArbolBinario(Nodo raiz){
        this.raiz = raiz;
        this.hijoDer = raiz.der;
        this.hijoIzq = raiz.izq;
    }

    Nodo raizArbol(){
        return raiz;
    }

    boolean estaVacio(){
        return raiz == null;
    }

    Nodo nuevoArbol(Nodo hijoIzq, Object dato, Nodo hijoDer){
        return new Nodo(hijoIzq, dato, hijoDer);
    }

}

