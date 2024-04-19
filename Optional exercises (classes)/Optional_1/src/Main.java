import java.util.Random;

public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {
        Window[] windows = new Window[10];

        for (int i = 0; i < windows.length; i++) {
            windows[i] = new Window("Window " + (i + 1), random.nextInt(31) +
                    90, random.nextInt(61) + 40);
        }

        for (Window window : windows) {
            System.out.println(window);
        }
    }
}