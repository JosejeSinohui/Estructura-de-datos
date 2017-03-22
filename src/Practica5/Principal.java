package Practica5;

import java.util.Scanner;

public class Principal {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int eleccion;
        System.out.println("Elija una opcion:");
        System.out.println("1.- Potencia o Factorial");
        System.out.println("2.- Abecedario");
        System.out.println("3.- Suma o Multiplicacion de vectores");
        System.out.println("4.- Salir");
        eleccion = input.nextInt();
        switch (eleccion) {
            case 1:
                Primero.menu();
            case 2:
                Segundo.menu();
            case 3:
                Tercero.menu();
            case 4:
                System.exit(0);
            default:
                menu();
        }

    }

}
