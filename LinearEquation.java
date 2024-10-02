import java.util.Scanner;
import java.lang.Math;
public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private double slope;
    private double distance;
    private double y_intercept;
    private double coordinate_point;

    public LinearEquation(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 =y2;

    }

    public void set_xValue(int new_xValue) {
        x = new_xValue;

    }

    public void set_yValue(int new_yValue) {
        y = new_yValue;

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
        String str =  "Enter your first Coordinate Point: ";
        String x = s.nextLine();

        str += "\n" + "Enter your second Coordinate Point: ";
        String y = s.nextLine();

        str += "\n" + "First pair: " + x + "\n";
        str += "Second pair: " + y + "\n";
        str += "Slope of line: " + slope + "\n";
        str += "Y-intercept: " + y_intercept + "\n";
        str += "Slope intercept form: " + "\n";
        str += "Distance between points: " + distance + "\n";

        str +=  "Enter a third x-value: " + "\n";
        String x3 = s.nextLine();

        str += "Solved coordinate point is: " + "(" + x3 + "," + coordinate_point + ")";

        return str;

    }

}
