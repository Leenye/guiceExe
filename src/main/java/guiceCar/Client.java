package guiceCar;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import miniGuice.annotationBinding.*;
import miniGuice.annotationBinding.Module;

public class Client {

    public static void main(String args[]){

        Injector injector = Guice.createInjector();
        Car car = injector.getInstance(Car.class);

        //without injecting engine, how to get the instance ?
        Engine engine = injector.getInstance(Engine.class);
        Wheel wheel = injector.getInstance(Wheel.class);

        System.out.println(wheel);
        System.out.println(engine);

        engine.toString();

        car.displayInfo();
    }
}
