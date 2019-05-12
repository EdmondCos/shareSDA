package exception.vehicle;

public class CarCrashException extends Exception{

    public CarCrashException(){
    }

    public CarCrashException(String message) {
        super(message);
    }
}
