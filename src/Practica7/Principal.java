package Practica7;

public class Principal {
    public static void main(String[] args){
        ArbolBinario arbol = new ArbolBinario();
        Nodo n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15;

        n1 = arbol.nuevoArbol(null, "1", null);
        n2 = arbol.nuevoArbol(null, "2", null);
        n3 = arbol.nuevoArbol(n1, "3", n2);

        n4 = arbol.nuevoArbol(null, "4", null);
        n5 = arbol.nuevoArbol(null, "5", null);
        n6 = arbol.nuevoArbol(n4, "6", n5);

        n7 = arbol.nuevoArbol(n3, "7", n6);

        n8 = arbol.nuevoArbol(null, "8", null);
        n9 = arbol.nuevoArbol(null, "9", null);
        n10 = arbol.nuevoArbol(n8, "10", n9);

        n11 = arbol.nuevoArbol(null, "11", null);
        n12 = arbol.nuevoArbol(null, "12", null);
        n13 = arbol.nuevoArbol(n11, "13", n12);

        n14 = arbol.nuevoArbol(n10, "14", n13);


        n15 = arbol.nuevoArbol(n7, "15", n14);
        Imprimir.printNodo(n15);

        n15.mostrarPreOrden();
        System.out.println("--------");
        n15.mostrarInOrden();
        System.out.println("--------");
        n15.mostrarPostOrden();

    }

}