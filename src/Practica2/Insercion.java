package Practica2;

public class Insercion {

    public static void ascendente(Lista lista) {
        long inicio = System.currentTimeMillis();

        for (Nodo i = lista.primero; i != null; i=i.getEnlace()) {
//            int temp = arreglo[i];
            int temp = i.getDato();

            for (Nodo j = i.getEnlace(); j != null && temp < j.getDato(); j=j.getEnlace()){
                if(j.getEnlace() == null){
                    break;
                }
                //arreglo[j + 1] = arreglo[j];
                j.getEnlace().setDato(j.getDato());
//                arreglo[j] = temp;
                j.setDato(temp);
            }
        }

        long fin = System.currentTimeMillis();
        System.out.println("Inscercion Ascendente Tiempo: " + (fin - inicio) + "ms");

    }
}
