package miniGuice.linkBinding;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import miniGuice.annotationBinding.*;
import miniGuice.annotationBinding.Module;

public class App {
    public static void main(String args[]){
        Injector injector = Guice.createInjector(new Module());
        Animal animal = injector.getInstance(Animal.class);
        animal.getSkills();

    }
}
