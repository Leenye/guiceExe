package miniGuice.annotationBinding;

public class FoodProvider {
    private String animalFood;
    private String location;

    public FoodProvider(String animalFood, String location) {
        this.animalFood = animalFood;
        this.location = location;
    }

    public void providesFood() {
        System.out.println(animalFood);
    }
}
