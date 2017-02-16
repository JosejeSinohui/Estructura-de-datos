package Practica2;

public class Seleccion {

    public static void ascendente(Lista lista) {
        long inicio = System.currentTimeMillis();

        for (Nodo i = lista.primero; i != null; i = i.getEnlace()) {

            Nodo menor = i;

            for (Nodo j = i; j != null; j = j.getEnlace()) {

                if (menor.getDato() > j.getDato()) menor = j;

            }

            int temp = i.getDato();
            i.setDato(menor.getDato());
            menor.setDato(temp);

        }

        long fin = System.currentTimeMillis();
        System.out.println("Seleccion Ascendente Tiempo: " + (fin - inicio) + "ms");

    }

    public static void descendente(Lista lista) {
        long inicio = System.currentTimeMillis();


        for (Nodo i = lista.primero; i != null; i = i.getEnlace()) {

            Nodo mayor = i;

            for (Nodo j = i; j != null; j = j.getEnlace()) {

                if (mayor.getDato() < j.getDato()) mayor = j;

            }

            int temp = i.getDato();
            i.setDato(mayor.getDato());
            mayor.setDato(temp);

        }


        long fin = System.currentTimeMillis();
        System.out.println("Seleccion Descendente, Tiempo: " + (fin - inicio) + "ms");


    }

}
