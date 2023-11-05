public class NegativeAgeException extends RuntimeException{
    public NegativeAgeException(String message, Throwable cause){
        super(message, cause);
    }
}
