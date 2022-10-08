public class InsufficientStock extends Exception {
    String message1 ;

    public InsufficientStock (String message){
        this.message1=message;

    }

    @Override
    public String getMessage() {
        return this.message1;
    }
}
