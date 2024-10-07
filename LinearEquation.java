import java.util.Scanner;
import java.lang.Math;
public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private double slope;
    private double y_intercept;
    private double coordinate_point;
    private double distance;

    public LinearEquation(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 =y2;


    }

    public void set_xValue(int new_xValue, int new_yValue) {
        x = new_xValue;
        y = new_yValue;

    }

    public void set_yValue(int new_x2Value, int new_y2Value) {
        x2 = new_x2Value;
        y2 = new_y2Value;

    }

    public double slope() {
        slope = Math.sqrt(Math.pow((y2 - y), 2) / Math.pow((x2 - x), 2));
        return slope;
    }


    public double y_intercept() {
        y_intercept = -((slope * x) - y);
        return y_intercept;
    }


    public double distance() {
        distance = ((x2 - x) + (y2 - y));
        return distance;
    }

    public double getCoordinate_point() {
        coordinate_point = (Math.sqrt(Math.pow((y2 - y), 2) / Math.pow((x2 - x), 2))) -((slope * x) - y);
        return coordinate_point;
    }


    public String toString() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first Coordinate Point: ");
        String x = s.nextLine();

        System.out.print("\n" + "Enter your second Coordinate Point: ");
        String y = s.nextLine();

        System.out.print("\n" + "First pair: " + set_xValue() + "\n");
        System.out.print("Second pair: " + set_yValue() + "\n");
        System.out.print("Slope of line: " + slope() + "\n");
        System.out.print("Y-intercept: " + y_intercept() + "\n");
        System.out.print("Slope intercept form: " + slope + "x +" + y_intercept + "\n");
        System.out.print("Distance between points: " + distance() + "\n");

        System.out.print("Enter a third x-value: " );
        String x3 = s.nextLine();

        System.out.print("Solved coordinate point is: " + "(" + x3 + "," + getCoordinate_point() + ")");


        return toString();

    }

}
