package lschrenk;

public class StackTest {
    public static void main(String[] args) {
        // Test for integer stack
        Stack<Integer> intStack = new Stack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Integer Stack:");
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Peeked: " + intStack.peek());
        System.out.println("List: " + intStack.list());

        // Test for string stack
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Stack");
        System.out.println("\nString Stack:");
        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Peeked: " + stringStack.peek());
        System.out.println("List: " + stringStack.list());
    }
}
