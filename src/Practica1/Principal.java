package Practica1;

public class Principal{

    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);

        Arreglo.crear(size);
        Arreglo.llenar();


        Arreglo.mostrar(Arreglo.contenido);
        Arreglo.mostrar(Arreglo.contenido2);

        Burbuja.ascendente(Arreglo.contenido2);
        Burbuja.ascendente(Arreglo.contenido);


    }
}