package Practica1;

public class Arreglo {

    static int[] contenido;
    static int[] contenido2;
    public static void crear(int tamaño) {
        contenido = new int[tamaño];
        contenido2 = new int[tamaño];
    }

    public static void llenar() {
        for (int i = 0; i < contenido.length; i++) {
            int random = (int) (Math.random() * 10);
            contenido[i] = random;
            contenido2[i] = random;
        }
    }

    public static void mostrar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "   ");
        }
        System.out.println();
    }

}