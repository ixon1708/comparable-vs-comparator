package task;

public class Point implements Comparable<Point> {

    private final double x;
    private final double y;
    private final String name;

    public Point(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.name = "";
    }

    @Override
    public String toString() {
        return "\nPoint{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Point point) {
        int xDiff = (int) (this.x - point.x);
        int yDiff = (int) (this.y - point.y);
        if (xDiff != 0) {
            return xDiff;
        }
        return yDiff;
        //специально не используется name т.к. точки A(2,3) и B(2,3) - это одна и та же точка
    }

}
