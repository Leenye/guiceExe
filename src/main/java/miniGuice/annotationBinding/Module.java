package miniGuice.annotationBinding;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import miniGuice.linkBinding.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(Animal.class).to(Dog.class);
        bind(Animal.class).annotatedWith(Names.named("cat")).to(Cat.class);
        bind(Integer.class).annotatedWith(Names.named("maxAnimalNum")).toInstance(5);

    }


    @Provides
    FoodProvider provideFoodProvider() {
        FoodProvider provider = new FoodProvider("cats'food", "Jinye 1Rd");
        return provider;
    }

}
