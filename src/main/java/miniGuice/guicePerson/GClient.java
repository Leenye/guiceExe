package miniGuice.guicePerson;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GClient {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        GPerson gPerson = injector.getInstance(GPerson.class);
        gPerson.diplayInfo();
    }

}
