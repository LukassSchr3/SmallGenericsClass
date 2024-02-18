package lschrenk;
public class Stack<T> {
    private T[] elements;
    private int index;

    public Stack() {
        this(10);
    }

    // Constructor with initial capacity
    public Stack(int capacity) {
        elements = (T[]) new Object[capacity];
        index = -1;
    }

    public void push(T item) {
        if (index == elements.length - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++index] = item;
    }

    // Pop method to remove and return the top element from the stack
    public T pop() {
        if (index == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        T item = elements[index];
        elements[index--] = null;
        return item;
    }

    // Peek method to return the top element without removing it
    public T peek() {
        if (index == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return elements[index];
    }

    // Method to list all elements of the stack as a string separated by ';'
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            sb.append(elements[i]);
            if (i < index) {
                sb.append("; ");
            }
        }
        return sb.toString();
    }
}

