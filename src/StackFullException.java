/**
 * StackFullException is thrown when an element is being pushed despite the stack being full
 * @author julia
 * @version 2024-02-19
 */
public class StackFullException extends RuntimeException{
    /**
     * Construktor for the StackFullException
     * @param param the text being shown during an occurring error
     */
    public StackFullException(String param){
        super(param);
    }
}
