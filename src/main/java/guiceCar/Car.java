package guiceCar;

public class Car {

    public void displayInfo(){
        Wheel wheel = new Wheel();
        Engine engine = new Engine();
        System.out.println(wheel);
        System.out.println(engine);
    }

    public String getInfo(){
        Wheel  wheel = new Wheel();
        Engine engine = new Engine();
        return wheel.toString()+engine.toString();
    }
}
