public class Stack<T> {
    private T[] stack = (T[]) new Object[3];


    public Stack(){
        stack = (T[]) new Object[3];
    }

    public Stack(int length){
        stack = (T[]) new Object[length];
    }

}
