package miniGuice.annotationBinding;

import com.google.inject.ImplementedBy;

@ImplementedBy(Cat.class)
public interface Animal {
    void getDiet();
}
