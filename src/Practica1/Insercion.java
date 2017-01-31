package Practica1;


public class Insercion {
    public static void ascendente(int[] arreglo) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < arreglo.length; i++){
            int temp = arreglo[i];

            for(int j = i - 1; j >= 0 && temp < arreglo[j] ; j--){
                arreglo[j + 1] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        long fin = System.currentTimeMillis();
        System.out.println("Inscercion Ascendente Tiempo: " + (fin - inicio) + "ms");

    }

    public static void descendente(int[] arreglo) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < arreglo.length; i++){
            int temp = arreglo[i];

            for(int j = i - 1; j >= 0 && temp > arreglo[j] ; j--){
                arreglo[j + 1] = arreglo[j];
                arreglo[j] = temp;
            }
        }


        long fin = System.currentTimeMillis();
        System.out.println("Insercion Descendente, Tiempo: " + (fin - inicio) + "ms");


    }
}
