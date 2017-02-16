package Practica2;

public class Burbuja {

    public static void ascendente(Lista lista) {

        long inicio = System.currentTimeMillis();

        int temp;
        boolean terminado = false;
        while (!terminado) {

            terminado = true;

            for (Nodo i = lista.primero; i != null; i = i.getEnlace()) {
                if (i.getEnlace() == null) {
                    break;
                }
                if (i.getDato() > i.getEnlace().getDato()) {
                    temp = i.getDato();
                    i.setDato(i.getEnlace().getDato());
                    i.getEnlace().setDato(temp);
                    terminado = false;

                }
            }
        }

        long fin = System.currentTimeMillis();

        System.out.println("Burbuja ascendente Tiempo: " + (fin - inicio) + "ms");

    }

    public static void descendente(Lista lista) {

        int temp;
        boolean terminado = false;

        long inicio = System.currentTimeMillis();
        while (!terminado) {

            terminado = true;

            for (Nodo i = lista.primero; i != null; i = i.getEnlace()) {
                if (i.getEnlace() == null) {
                    break;
                }
                if (i.getDato() < i.getEnlace().getDato()) {
                    temp = i.getDato();
                    i.setDato(i.getEnlace().getDato());
                    i.getEnlace().setDato(temp);
                    terminado = false;

                }
            }
        }


        long fin = System.currentTimeMillis();

        System.out.println("Burbuja Descendente, Tiempo: " + (fin - inicio) + "ms");


    }

}
