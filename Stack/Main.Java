import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.peek()); // prints "C"
        System.out.println(stack.empty()); // prints false
        System.out.println(stack.search("B")); // prints 2
        System.out.println(stack.size()); // prints 3
    }
}
