public class NullArgException extends BankOnlineException{
    NullArgException() {}

    NullArgException(String message){
        super(message);
    }
}