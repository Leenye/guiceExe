package guiceCar;


public class CarFactory {

    public static Car getInstance(){
        Engine engine = new Engine();
        Wheel wheel = new Wheel();
        Car car = new Car(wheel,engine);
        return car;
    }
}
