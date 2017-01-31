package Practica1;

public class Burbuja {

    public static void ascendente(int[] arreglo) {

        long inicio = System.currentTimeMillis();

        int temp;
        boolean terminado = false;
        while (!terminado) {

            terminado = true;

            for (int i = 0; i < arreglo.length - 1; i++) {

                if (arreglo[i] > arreglo[i + 1]) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    terminado = false;

                }
            }
        }

        long fin = System.currentTimeMillis();

        System.out.println("Burbuja ascendente Tiempo: " + (fin - inicio) + "ms");

    }

    public static void descendente(int[] arreglo) {

        int temp;
        boolean terminado = false;

        long inicio = System.currentTimeMillis();

        while (!terminado) {

            terminado = true;

            for (int i = 0; i < arreglo.length - 1; i++) {

                if (arreglo[i] < arreglo[i + 1]) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    terminado = false;

                }
            }
        }

        long fin = System.currentTimeMillis();

        System.out.println("Burbuja Descendente, Tiempo: " + (fin - inicio) + "ms");


    }

}
