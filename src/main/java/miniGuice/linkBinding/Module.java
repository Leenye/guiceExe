package miniGuice.linkBinding;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(Animal.class).to(Dog.class);
    }
}
