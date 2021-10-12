import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // FIRST LINE POINTS

        System.out.println("\nEnter the points of the first Line: \n");

        System.out.println("Insert the x value of the first point");
        double x1 = scan.nextDouble();
        System.out.println("Insert the y value of the first point");
        double y1 = scan.nextDouble();
        Point point1 = new Point(x1, y1);

        System.out.println("Insert the x value of the Second point");
        double x2 = scan.nextDouble();
        System.out.println("Insert the y value of the Second point");
        double y2 = scan.nextDouble();
        Point point2 = new Point(x2, y2);

        Line line1 = new Line(point1, point2);

        double line1Length = line1.getLength();

        // SECOND LINE POINTS

        System.out.println("\nEnter the points of the Second Line: \n");

        System.out.println("Insert the x value of the first point");
        double x3 = scan.nextDouble();
        System.out.println("Insert the y value of the first point");
        double y3 = scan.nextDouble();
        Point point3 = new Point(x3, y3);

        System.out.println("Insert the x value of the Second point");
        double x4 = scan.nextDouble();
        System.out.println("Insert the y value of the Second point");
        double y4 = scan.nextDouble();
        Point point4 = new Point(x4, y4);

        Line line2 = new Line(point3, point4);

        double line2Length = line2.getLength();

        // THRID LINE POINTS

        System.out.println("\nEnter the points of the Third Line: \n");

        System.out.println("Insert the x value of the first point");
        double x5 = scan.nextDouble();
        System.out.println("Insert the y value of the first point");
        double y5 = scan.nextDouble();
        Point point5 = new Point(x5, y5);

        System.out.println("Insert the x value of the Second point");
        double x6 = scan.nextDouble();
        System.out.println("Insert the y value of the Second point");
        double y6 = scan.nextDouble();
        Point point6 = new Point(x6, y6);

        Line line3 = new Line(point5, point6);

        double line3Length = line3.getLength();

        boolean theoremCheck = checkTheorem(line1Length, line2Length, line3Length);

        if (theoremCheck == true) {
            System.out.println(
                    "Your points in the triangle satisfy the Triangle Inequality Theorem. A Triangle can be built");
        } else {
            System.out.println(
                    "Your points in the triangle does not satisfy the Triangle Inequality Theorem. A Triangle cannot be built");
        }

    }

    public static boolean checkTheorem(double line1Length, double line2Length, double line3Length) {
        double sum1_2, sum1_3, sum2_3;
        sum1_2 = line1Length + line2Length;
        sum1_3 = line1Length + line3Length;
        sum2_3 = line2Length + line3Length;

        if (sum1_2 < line3Length) {
            return false;
        } else if (sum1_3 < line2Length) {
            return false;
        } else if (sum2_3 < line1Length) {
            return false;
        } else {
            return true;
        }

    }
}
