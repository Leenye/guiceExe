package miniGuice.annotationBinding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

    public static void main(String args[]){
        Injector injector = Guice.createInjector(new Module());
        Animal animal = injector.getInstance(Animal.class);
        AnimalKeeper keeper = injector.getInstance(AnimalKeeper.class);

        animal.getDiet();
        keeper.getManul();
    }
}
