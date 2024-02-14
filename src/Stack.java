public class Stack<T> {
    private T[] stack = (T[]) new Object[3];
    private int topElement = stack.length;



    public Stack(int length){
        stack = (T[]) new Object[length];
    }

    public void push(T element){
        stack[topElement--] = element;
    }

    public T pop() throws StackFullException, StackEmptyException {
        if(topElement < 0)throw new StackFullException();
        if(stack[topElement] == null) throw new StackEmptyException();
        T x = stack[topElement];
        stack[topElement--] = null;
        return x;
    }

    public T peek() throws StackFullException, StackEmptyException {
        if(topElement < 0)throw new StackFullException();
        if(stack[topElement] == null) throw new StackEmptyException();
        return stack[topElement];
    }
    public String list() throws StackFullException, StackEmptyException {
        String output = "";
        for (int i = topElement; i >= 0; i--){
            output += stack[i] + "; ";
        }
        return output;
    }
}
