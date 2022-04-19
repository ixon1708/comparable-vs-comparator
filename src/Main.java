import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] bookArray = {new Book("War and Piece volume 4", "Lev Tolstoy", 202),
                new Book("War and Piece volume 1", "Lev Tolstoy", 308),
                new Book("War and Piece volume 3", "Lev Tolstoy", 346),
                new Book("War and Piece volume 2", "Lev Tolstoy", 322),
                new Book("War and Piece epilogue", "Lev Tolstoy", 96),
                new Book("Fahrenheit 451", "Ray Bradbury", 256)};
        Arrays.sort(bookArray);

        Dog[] dogArray = {new Dog("Sparky", 5, 1, DogBreed.DACHSHUND),
                new Dog("Lucky", 2, 2, DogBreed.HOUND),
                new Dog("Bobik", 3, 1, DogBreed.BULLDOG),
                new Dog("Barbos", 7, 2, DogBreed.LAIKA)};

        Arrays.sort(dogArray, new DogComparator());

        for(Dog dog: dogArray){
            System.out.println(dog);
        }

    }
}
