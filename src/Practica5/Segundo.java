package Practica5;

import static Practica5.Principal.input;

public class Segundo {
    public static void menu() {
        System.out.println("----------------------------------");
        int eleccion;
        System.out.println("Elija una opcion:");
        System.out.println("1.- Mayusculas");
        System.out.println("2.- Minusculas");
        System.out.println("3.- Volver");
        eleccion = input.nextInt();
        switch (eleccion) {
            case 1:
                imprimirMayus('A');
                menu();
            case 2:
                imprimirMinus('a');
                menu();
            case 3:
                Principal.menu();
            default:
                menu();
        }

    }

    public static void imprimirMayus(char x) {
        if (x == 'Z') {
            System.out.print('Z');
        } else {
            System.out.print(x);
            imprimirMayus((char) (x + 1));
        }
    }

    public static void imprimirMinus(char x) {
        if (x == 'z') {
            System.out.print('z');
        } else {
            System.out.print(x);
            imprimirMinus((char) (x + 1));
        }
    }

}
