package Practica2;

public class Lista {
    public Nodo primero;
    int size;

    // constructor de la lista, primer dato en nulo
    public Lista() {
        this.primero = null;
        size = 0;
    }

    // agrega un nodo al principio de la lista
    public Lista agregarCabezaLista(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setEnlace(primero);
        nuevo.setIndice(0);
        primero = nuevo;
        // aumento de indices.
        for (Nodo i = primero.getEnlace(); i != null; i = i.getEnlace()) {
            i.setIndice(i.getIndice() + 1);
        }
        size++;
        return this;
    }

    // Metodo para borrar toda la lista.
    public void borrarLista() {
        primero = null;
    }

    // Metodo para borrar solo el ultimo elemento de la lista,
    public Lista borrarUltimo() {
        for (Nodo i = primero; i != null; i = i.getEnlace()) { //Ciclo para recorrer toda la lista,
            if (i.getIndice() == size - 2) {// en el penultimo nodo
                i.setEnlace(null);         // cambiamos el enlace a null
                size--;                    // y disminuimos el size
                break;                     // nos salimos del ciclo para evitar nullpointer exception en el ciclo.
            }
        }
        return this;
    }

    public Lista borrarPrimero() {
        this.primero = primero.getEnlace();
        return this;
    }

    public Lista agregarFinal(int dato) {
        Nodo indice, ultimo; // indice nos dira donde agregar el nuevo nodo que se llama ultimo,
        indice = primero; // se convierte en el primer nodo para recorrer la lista
        if (indice != null) {
            while (indice.getEnlace() != null) {
                indice = indice.getEnlace();
            } // despues de recorrerla indice tiene el valor del ultimo nodo de la lista
            ultimo = new Nodo(dato);// se crea el nuevo nodo que pondremos al final
            indice.setEnlace(ultimo); // al ultimo nodo de la lista le enlazamos el que recien creamos
            ultimo.setIndice(size);// le ponemos su indice que sera igual al size de la lista
        }
        size++; // le sumamos 1 ya que agregamos un nuevo nodo,
        return this;
    }

    public void eliminarNodo(int index) {

        for (Nodo i = primero; i != null; i = i.getEnlace()) {
            if (i.getEnlace().getIndice() == index) { // si el proximo elemento en la lista es el que contiene el indice
                i.setEnlace(i.getEnlace().getEnlace()); // cambiamos el enlace para "saltearnos" el proximo nodo
                // y asi eliminarlo

                //recorrer la lista para disminuir los indices
                for (Nodo j = i.getEnlace(); j != null; j = j.getEnlace()) {
                    j.setIndice(j.getIndice() - 1);
                }

                size--; // disminuir el size por que borramos un nodo

                break; // salirnos del ciclo para evitar nullpointer exception
            }


        }

    }

    public void visualiza() {
        Nodo n = primero;

        while (n != null) {
            System.out.println("Dato:" + n.getDato() + "\tEnlace:" + n.getEnlace() + "Indice: " + n.getIndice());
            n = n.getEnlace();
        }
    }

    public void agregarEnmedio(int indice, int dato) {
        for (Nodo i = primero; i != null; i = i.getEnlace()) {
            if (i.getIndice() == indice) {             // recorre la lista y encuentra el indice donde poner el nodo
                Nodo nuevo = new Nodo(dato);
                nuevo.setIndice(i.getIndice());     // crea el nodo y le asigna el indice que va a "reemplazar"
                nuevo.setEnlace(i.getEnlace());     // se establece el enlace de este nuevo nodo al enlace del que reemplazo
                i.setEnlace(nuevo);                 // ahora el nodo reemplazado apunta al que insertamos.

                for (Nodo j = nuevo; j != null; j = j.getEnlace()) { // aumento de indices;
                    j.setIndice(j.getIndice() + 1);
                }
                size++; //por que agregamos un nuevo nodo
                break; // break para evitar null pointer exception
            }
        }
    }
}
