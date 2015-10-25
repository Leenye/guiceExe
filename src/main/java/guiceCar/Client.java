package guiceCar;


public class Client {

    public static void main(String args[]){
        Wheel wheel = new Wheel();
        Engine engine = new Engine();
        Car car = new Car(wheel, engine);

        car.displayInfo();
    }
}
