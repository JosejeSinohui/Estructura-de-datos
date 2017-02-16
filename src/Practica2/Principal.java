package Practica2;

public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();

       for (int i = 0; i < 100000; i++) {
            lista.agregarCabezaLista((int) (Math.random()*50));
        }

//        Burbuja.ascendente(lista);
//        Burbuja.descendente(lista);
//        Seleccion.ascendente(lista);
//        Seleccion.descendente(lista);
          //Insercion.ascendente(lista);

    }

}
