/**
 * Class Stack saves a stack of elements; primitive and reference types allowed
 * @param <T> Type parameter for the class
 */
public class Stack<T> {
    private  T[] stack;
    private int topElement = -1;
    private int size;


    /**
     * Constructor for the stack class
     * @param length sets the size of the stack
     *
     */
    public Stack(int length){
        stack = (T[]) new Object[length];
        size = stack.length;
    }

    /**
     * Push method pushes an element to the top of the stack as long as the stack is not full
     * @param element the element being added to the stack
     */
    public void push(T element){
        if(++topElement >= size)throw new StackFullException("Kein Platz!");
        stack[topElement] = element;
    }

    /**
     * Pop method deletes the element at the top and returns it
     * @return the element being removed
     */
    public T pop() {
        if(topElement == -1) throw new StackEmptyException("Leeres Stack!");
        T x = stack[topElement];
        stack[topElement--] = null;
        return x;
    }

    /**
     * Method peek returns the top element without removing it
     * @return the element at the top
     */
    public T peek() {
        if(topElement == -1) throw new StackEmptyException("Leeres Stack!");
        return stack[topElement];
    }

    /**
     * Returns elements of the stack as a String
     * @return the String with the elements of the stack
     */
    public String list() {
        String output = "";
        for (int i = topElement; i >= 0; i--){
            output += stack[i] + ";\n" ;
        }
        return output;
    }
}
