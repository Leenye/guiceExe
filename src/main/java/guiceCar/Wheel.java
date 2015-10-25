package guiceCar;

public class Wheel {
    private int num;
    private String material;

    public Wheel() {
        this.num = 4;
        this.material = "rubber and matel";
    }

    public String toString(){
        return "[wheel: " + "num " + num + "," + "materail " + material +"]";
    }

}
