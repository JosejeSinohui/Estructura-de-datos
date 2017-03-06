package Practica3;

public class PilaArreglo {
    int size;
    int top;
    int[] stackArray;


    PilaArreglo(int size) {
        this.size = size;
        top = -1;
        stackArray = new int[size];
    }


    PilaArreglo push(int value) {
        if (full()) {
            System.out.println("Full stack, cannot add anymore items");
        } else {
            stackArray[++top] = value;
        }
        return this;
    }

    boolean full() {
        return top == size - 1;
    }


    int pop() {
        if (!empty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack empty already");
            return 0;
        }
    }


    boolean empty() {
        return top == -1;
    }


    void displayStack() {
        for (int i = 0; i < top; i++) {
            System.out.println(stackArray[i]);
        }
    }


    int stackTop() {
        return stackArray[top];
    }
}