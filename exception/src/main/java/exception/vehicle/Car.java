package exception.vehicle;

public class Car {
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(int newSpeed) {
        if (newSpeed > maxSpeed) {
//            throw new IllegalArgumentException("Speed not supported");
            throw new CarCrashException("Speed not supported");
        }
        maxSpeed = newSpeed;
    }
}
