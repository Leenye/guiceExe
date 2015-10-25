package miniGuice.linkBinding;


public class Dog implements Animal{
    @Override
    public void getSkills() {
        System.out.println("dogs can guard home");
    }
}
