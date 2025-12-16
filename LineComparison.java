import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter coordinates for Line 1:");
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        Line line1 = new Line(x1, y1, x2, y2);
        System.out.println("\nEnter coordinates for Line 2:");
        System.out.print("Enter x1: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y3 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x4 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y4 = scanner.nextDouble();
        Line line2 = new Line(x3, y3, x4, y4);
        System.out.println("\nLength of Line 1: " + line1.calculateLength());
        System.out.println("Length of Line 2: " + line2.calculateLength());
        if (line1.equals(line2)) {
            System.out.println("\nBoth lines are equal");
        } else {
            System.out.println("\nLines are not equal");
        }
        int comparisonResult = line1.compareTo(line2);
        if (comparisonResult == 0) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
        scanner.close();
    }
}