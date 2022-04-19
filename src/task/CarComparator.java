package task;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        int diffOfYears = car1.getYear() - car2.getYear();
        int diffOfModels = car1.getModel().compareTo(car2.getModel());
        int diffOfPetrol = car1.getPetrol().compareTo(car2.getPetrol());
        int diffOfVolumes = (int) (car1.getEngineVolume() - car1.getEngineVolume());
        if (diffOfModels != 0) {
            return diffOfModels;
        }
        if (diffOfYears != 0) {
            return diffOfYears;
        }
        if (diffOfPetrol != 0) {
            return diffOfPetrol;
        }
        return diffOfVolumes;
    }

}
