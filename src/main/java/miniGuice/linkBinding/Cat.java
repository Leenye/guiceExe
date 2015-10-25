package miniGuice.linkBinding;

public class Cat implements Animal{
    @Override
    public void getSkills() {
        System.out.println("cats can catch mouse");
    }
}
