package guiceCar;


public class EngineImp implements Engine {
    private double power;
    private double displacement;

    public EngineImp() {
        this.power = 100;
        this.displacement = 1.8;
    }

    public String getEngine(){
        return String.format("The power of the engine is %s, and the displacement is %s", power,displacement);
    }
}
