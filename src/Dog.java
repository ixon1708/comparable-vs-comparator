public class Dog {

    private final String name;
    private int age;
    private int height;
    private final DogBreed breed;

    public Dog(String name, int age, int height, DogBreed breed) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", breed=" + breed +
                '}';
    }
}
