package guiceCar;

public class Car {
    private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void displayInfo(){
        System.out.println(wheel);
        System.out.println(engine);
    }

    public String getInfo(){
        return wheel.toString()+engine.toString();
    }
}
