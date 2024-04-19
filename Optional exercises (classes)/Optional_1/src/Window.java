public class Window {
    private String name;
    private int width;
    private int height;

    public Window(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public  String toString() {
        return name + '\'' +
                ", width=" + width +
                ", height=" + height;
    }
}
