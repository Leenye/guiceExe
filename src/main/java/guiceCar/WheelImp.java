package guiceCar;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class WheelImp implements Wheel{
    private int num;
    private String material;


    public WheelImp() {
        this.num = 4;
        this.material = "rubber and matel";
    }

    public String getWheel(){
        return String.format("there are %s wheels, made of %s",num,material);
    }
}
