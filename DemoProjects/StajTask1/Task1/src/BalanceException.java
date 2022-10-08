public class BalanceException extends Exception{
    String message;

    public BalanceException (String message){
        this.message=message;

    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
