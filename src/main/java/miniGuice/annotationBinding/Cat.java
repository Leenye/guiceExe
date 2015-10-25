package miniGuice.annotationBinding;

public class Cat implements Animal {
    @Override
    public void getDiet() {
        System.out.println("cats eat fish");
    }
}
