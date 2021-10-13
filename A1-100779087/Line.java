public class Line {

    private Point p1;
    private Point p2;

    // Create Constructor
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Getters and Setters

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    // Class method to find length of the line
    public double getLength() {
        return Math.sqrt(((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()))
                + ((p2.getY() - p1.getY()) * (p2.getY() - p1.getY())));
    }
}
