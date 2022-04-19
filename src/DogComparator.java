import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog dog1, Dog dog2) {
        int difNames = dog1.getName().compareTo(dog2.getName());
        int difAges = dog1.getAge() - dog2.getAge();
        int difHeights = dog1.getHeight() - dog2.getHeight();
        int difBreeds = dog1.getBreed().toString().compareTo(dog2.getBreed().toString());
        if(difNames != 0){
            return difNames;
        }
        if(difAges != 0){
            return difAges;
        }
        if(difHeights != 0) {
            return difHeights;
        }
        return difBreeds;
    }

}
