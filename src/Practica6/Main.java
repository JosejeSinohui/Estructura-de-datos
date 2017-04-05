package Practica6;

import static Practica5.Principal.input;

public class Main {
    private static int[] arreglo;

    public static void main(String[] args) {
        shuffle();
        menu();
    }

    private static void shuffle() {
        System.out.println("Elija un tamanio para el arreglo");
        int size = input.nextInt();
        arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = (int) (Math.random() * 1000 + 1);
        }
    }

    private static void show() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    private static void menu() {
        System.out.println("----------------------------------");
        int eleccion;
        System.out.println("Elija una opcion:");
        System.out.println("1.- Revolver");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Ordenar Merge");
        System.out.println("4.- Ordenar Quick");
        System.out.println("5.- Salir");
        eleccion = input.nextInt();
        switch (eleccion) {
            case 1:
                shuffle();
                menu();
            case 2:
                show();
                menu();
            case 3:
                MergeSort.sort(arreglo);
                menu();
            case 4:
                QuickSort.sort(arreglo);
                menu();
            case 5:
                System.exit(0);
            default:
                menu();
        }

    }
}
