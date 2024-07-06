import java.util.*;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x != other.x) {
            return this.x - other.x;
        } else {
            return this.y - other.y;
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.y != p2.y) {
            return p1.y - p2.y;
        } else {
            return p1.x - p2.x;
        }
    }
}

public class SortPoints {
    public static void main(String[] args) {
        Point[] points = new Point[100];
        Random rand = new Random();

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(rand.nextInt(100), rand.nextInt(100));
        }

        Arrays.sort(points);
        System.out.println("Points sorted by x-coordinate:");
        for (Point point : points) {
            System.out.print(point + " ");
        }

        Arrays.sort(points, new CompareY());
        System.out.println("\nPoints sorted by y-coordinate:");
        for (Point point : points) {
            System.out.print(point + " ");
        }
    }
}
