package lschrenk;
public class Stack<T> {
    private T[] elements;
    private int index;

    public Stack() {
        this(10); // Default capacity of 10
    }

    // Constructor with initial capacity
    public Stack(int capacity) {
        elements = (T[]) new Object[capacity];
        index = -1;
    }
}

