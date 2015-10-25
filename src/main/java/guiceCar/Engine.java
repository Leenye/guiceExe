package guiceCar;


import com.google.inject.Inject;

public class Engine {
    private double power;
    private double displacement;

    @Inject
    public Engine() {
        this.power = 100;
        this.displacement = 1.8;
    }

    public String toString(){
        return "[Engine: " + "power " + power + "kw, " + "displacement " + displacement +"]";
    }
}
