package task;

import java.util.Arrays;

public class TaskMain {

    public static void main(String[] args) {
        Point[] points = {
            new Point( 1, 2),
            new Point( 2, 3, "B"),
            new Point( 3, 3),
            new Point( 2, 3, "A")
        };
        Arrays.sort(points);
        System.out.println(Arrays.toString(points));

        Car[] cars = {
            new Car("Opel", 2008, 1.4, "benzine"),
            new Car("Opel", 2012, 1.9, "diesel"),
            new Car("Tesla", 2018, 500000, "electricity"),
            new Car("Audi", 2000, 1.8, "benzine-gas")
        };
        Arrays.sort(cars, new CarComparator());
        System.out.println(Arrays.toString(cars));
    }

}
