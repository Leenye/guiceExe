package miniGuice.annotationBinding;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class AnimalKeeper {
    private Animal animal;
    private int animalNum;

    @Inject
    public AnimalKeeper(@Named("cat") Animal animal, @Named("maxAnimalNum") int maxAnimalNum) {
        this.animal = animal;
        this.animalNum = maxAnimalNum;
    }

    public void getManul(){
        animal.getDiet();
        getMaxAnimalNum();
    }

    private void getMaxAnimalNum(){
        System.out.println("every animal keeper could raise " + animalNum +" animals at most");
    }
}
