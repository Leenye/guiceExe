package miniGuice.annotationBinding;

public class Dog implements Animal {
    @Override
    public void getDiet() {
        System.out.println("dogs eat meat");
    }
}
