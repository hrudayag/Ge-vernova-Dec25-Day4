import java.util.*;
class Point {
    double x;
    double y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class Line {
    Point point1;
    Point point2;

    Line(Point p1, Point p2) {
        point1 = p1;
        point2 = p2;
    }
    // UC 1: Calculate length of line
    double calculateLength() {
        double length = Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
        return length;
    }

    // UC 2: Check equality of two lines using equals method
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Line line = (Line) obj;
        return Double.compare(this.calculateLength(), line.calculateLength()) == 0;
    }

    // UC 3: Compare two lines using compareTo method
    public int compareTo(Line other) {
        double thisLength = this.calculateLength();
        double otherLength = other.calculateLength();
        return Double.compare(thisLength, otherLength);
    }
}
public class LineComp {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        // Input for first line
        System.out.println("\nEnter coordinates for Line 1:");
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Line line1 = new Line(p1, p2);
        // Input for second line
        System.out.println("\nEnter coordinates for Line 2:");
        System.out.print("Enter x1: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y3 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x4 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y4 = sc.nextDouble();

        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);
        Line line2 = new Line(p3, p4);

        // UC 1: Display lengths
        System.out.println("\nLength of Line 1: " + line1.calculateLength());
        System.out.println("Length of Line 2: " + line2.calculateLength());

        // UC 2: Check equality
        System.out.println("\nAre both lines equal? " + line1.equals(line2));

        // UC 3: Compare lines
        int result = line1.compareTo(line2);
        if(result == 0) {
            System.out.println("Both lines are equal in length");
        } else if(result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
        sc.close();
    }
}