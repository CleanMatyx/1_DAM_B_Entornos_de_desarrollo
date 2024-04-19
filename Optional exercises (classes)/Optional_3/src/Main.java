public class Main {
    public static void main(String[] args) {

        ThreeDPoint[] points = new ThreeDPoint[5];
        points[0] = new ThreeDPoint(1, 2, 3);
        points[1] = new ThreeDPoint(4, 5, 6);
        points[2] = new ThreeDPoint(7, 4, 3);
        points[3] = new ThreeDPoint(17, 6, 2);
        points[4] = new ThreeDPoint(13, 4, 19);

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }


        System.out.println("The distance between points " + points[2] + " and " + points[3] + " is: " +
                points[2].distanceTo(points[3]));
        System.out.println();

    }
}