package Practica5;

import static Practica5.Principal.input;

public class Tercero {

    static int[] arreglo = new int[0];
    static int eleccion;
    static int size = 0;

    public static void menu() {

        System.out.println("----------------------------------");
        System.out.println("Elija una opcion:");
        System.out.println("1.- Sumarlo");
        System.out.println("2.- Multiplicarlo");
        System.out.println("3.- Imprimir Arreglo");
        System.out.println("4.- Crear Arreglo");
        System.out.println("5.- Volver");
        eleccion = input.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println(sumar(arreglo, arreglo.length - 1));
                menu();
            case 2:
                System.out.println(multiplicar(arreglo, arreglo.length - 1));
                menu();
            case 3:
                for (int i = 0; i < size; i++) {
                    System.out.println(arreglo[i]);
                }
                menu();
            case 4:
                System.out.println("Elija un tamanio para el arreglo");
                size = input.nextInt();
                arreglo = new int[size];
                for (int i = 0; i < size; i++) {
                    arreglo[i] = (int) (Math.random() * 10 + 1);
                }
                menu();
            case 5:
                Principal.menu();
            default:
                menu();
        }

    }

    public static int sumar(int[] arreglo, int actual) {
        if (actual == 0) {
            return arreglo[actual];
        } else {
            return arreglo[actual] + sumar(arreglo, --actual);
        }
    }

    public static int multiplicar(int[] arreglo, int actual) {
        if (actual == 0) {
            return arreglo[actual];
        } else {
            return arreglo[actual] * multiplicar(arreglo, --actual);
        }
    }
}
