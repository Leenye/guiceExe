package guiceCar;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule{

    protected void configure (){
        bind(Car.class).to(Car.class);

    }
}
