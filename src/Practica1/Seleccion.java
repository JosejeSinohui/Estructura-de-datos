package Practica1;

public class Seleccion {

    public static void ascendente(int[] arreglo) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < arreglo.length - 1; i++) {

            int indice = i;

            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[j] < arreglo[i]) indice = j;

            }

            int temp = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = temp;

        }

        long fin = System.currentTimeMillis();
        System.out.println("Seleccion Ascendente Tiempo: " + (fin - inicio) + "ms");

    }

    public static void descendente(int[] arreglo) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < arreglo.length - 1; i++) {

            int indice = i;

            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[j] > arreglo[i]) indice = j;

            }

            int temp = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = temp;

        }


        long fin = System.currentTimeMillis();
        System.out.println("Seleccion Descendente, Tiempo: " + (fin - inicio) + "ms");


    }

}
