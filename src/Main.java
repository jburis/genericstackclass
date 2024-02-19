/**
 * Testing methods of the Stack class
 * @author julia
 * @version 2024-02-19
 */
public class Main {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(4);
        //integerStack.peek();
        integerStack.push(5);
        integerStack.push(3);
        integerStack.push(2);
        integerStack.push(6);
        integerStack.list();
        System.out.println(integerStack.list());
        integerStack.pop();
        System.out.println(integerStack.list());
        integerStack.push(8);
        System.out.println(integerStack.peek() + "\n");
        System.out.println(integerStack.list());

        Stack<String> stringStack = new Stack<>(4);
        //stringStack.peek();
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");
        stringStack.list();
        System.out.println(stringStack.list());
        stringStack.pop();
        System.out.println(stringStack.list());
        stringStack.push("E");
        System.out.println(stringStack.peek() + "\n");
        System.out.println(stringStack.list());

    }
}