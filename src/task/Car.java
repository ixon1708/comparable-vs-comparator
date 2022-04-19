package task;

public class Car {

    private final String model;
    private final int year;
    private final double engineVolume;
    private final String petrol;

    public Car(String model, int year, double engineVolume, String petrol) {
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
        this.petrol = petrol;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getPetrol() {
        return petrol;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", engineVolume=" + engineVolume +
                ", petrol='" + petrol + '\'' +
                '}';
    }
}
