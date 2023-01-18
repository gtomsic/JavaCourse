public class Point {
    private int x;
    private int y;

    public  Point() {
        System.out.println("No args.");
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    // METHODS
    public double distance(){
        double xA, xB, yA, yB;
        xB = this.y;
        xA = this.x;
        return 0.0;
    }

    // GETTERS

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // SETTERS

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
