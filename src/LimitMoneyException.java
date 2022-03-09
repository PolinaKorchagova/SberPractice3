public class LimitMoneyException extends BankOnlineException{
    LimitMoneyException() {}

    LimitMoneyException(String message){
        super(message);
    }
}