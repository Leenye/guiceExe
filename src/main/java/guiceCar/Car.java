package guiceCar;

public class Car {

    public String getInfo(){
        Wheel  wheel = new WheelImp();
        Engine engine = new EngineImp();
        return wheel.toString()+engine.toString();
    }
}
