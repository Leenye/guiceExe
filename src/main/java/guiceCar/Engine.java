package guiceCar;


public class Engine {
    private double power;
    private double displacement;

    public Engine() {
        this.power = 100;
        this.displacement = 1.8;
    }

    public String toString(){
        return "[Engine: " + "power " + power + "kw, " + "displacement " + displacement +"]";
    }
}
