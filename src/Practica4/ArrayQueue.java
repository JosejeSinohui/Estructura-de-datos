package Practica4;

public class ArrayQueue {
    int size = 20;

    int front;

    int end;

    int[] list;

    ArrayQueue() {
        front = 0;
        end = -1;
        list = new int[size];
    }

    boolean isFull() {
        return size == end + 1;
    }

    boolean isEmpty() {
        return front > end;
    }

    void add(int valor) {
        if (!isFull()) list[++end] = valor;
        else System.out.println("full queue");
    }

    int remove() {
        if (!isEmpty()) return list[front++];
        else {
            System.out.println("it's empty");
            return 0;
        }
    }

}
