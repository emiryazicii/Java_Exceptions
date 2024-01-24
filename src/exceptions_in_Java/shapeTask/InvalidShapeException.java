package exceptions_in_Java.shapeTask;

public class InvalidShapeException extends RuntimeException{


    public InvalidShapeException(String message){

        super(message);

    }
}
