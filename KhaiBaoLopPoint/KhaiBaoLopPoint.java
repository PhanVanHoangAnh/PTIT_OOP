import java.util.Scanner;

public class KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = Integer.parseInt(sc.nextLine());
        String[] tests = new String[nums];

        for (int i = 0; i < nums; i++) {
            tests[i] = sc.nextLine();
        }

        for (int i = 0; i < tests.length; i++) {
            String[] parts = tests[i].split(" ");
            Point p1 = new Point(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
            Point p2 = new Point(Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));

            System.out.printf("%.4f\n", p1.distance(p2));
        }
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}