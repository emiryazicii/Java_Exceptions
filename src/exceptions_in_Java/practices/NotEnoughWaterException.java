package exceptions_in_Java.practices;

public class NotEnoughWaterException extends RuntimeException{

    public NotEnoughWaterException(){
        super("Water levels low");
    }
}
