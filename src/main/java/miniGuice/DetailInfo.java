package miniGuice;

public class DetailInfo {
    private String name;
    private int age;

    public DetailInfo() {
        this.name = "Lucy";
        this.age = 20;
    }

    public DetailInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "[Name: " + name + ", Age: " + age + "]";
    }
}
