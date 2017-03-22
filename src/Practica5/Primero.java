package Practica5;

import static Practica5.Principal.input;

public class Primero {


    public static void menu() {

        System.out.println("----------------------------------");
        int eleccion;
        System.out.println("Elija una opcion:");
        System.out.println("1.- Potencia");
        System.out.println("2.- Factorial");
        System.out.println("3.- Volver");
        eleccion = input.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Ingresa el valor a elevar");
                int numero = input.nextInt();
                System.out.println("Ingresa la potencia");
                int potencia = input.nextInt();
                System.out.println(potencia(numero, potencia));
                menu();
            case 2:
                System.out.println("Ingresa el valor a calcular el factorial");
                int fact = input.nextInt();
                System.out.println(factorial(fact));
                menu();
            case 3:
                Principal.menu();
            default:
                menu();
        }

    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(--n);
        }
    }

    public static int potencia(int numero, int potencia) {

        if (potencia == 0) {
            return 1;
        }

        return potencia(numero, --potencia) * numero;
    }

}
