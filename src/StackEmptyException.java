/**
 * StackEmptyException is thrown when the stack is empty
 * @author julia
 * @version 2024-02-19
 */
public class StackEmptyException extends RuntimeException{

    /**
     * Construktor for the StackEmptyException
     * @param param the text being shown during an occurring error
     */
    public StackEmptyException(String param){
            super(param);
        }
}
