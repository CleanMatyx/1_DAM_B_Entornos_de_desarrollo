public class ThreeDPoint {
    private int x;
    private int y;
    private int z;

    public ThreeDPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void moveTo(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceTo(ThreeDPoint p2) {
        double distance = Math.sqrt(Math.pow((p2.x - this.x), 2) +
                Math.pow((p2.y - this.y), 2) + Math.pow((p2.z - this.z), 2));
        return distance;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
