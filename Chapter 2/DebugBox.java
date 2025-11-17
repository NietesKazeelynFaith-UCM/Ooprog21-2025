public class DebugBox {
    private int width;
    private int length;
    private int height;

    // Default constructor
    public DebugBox() {
        this.width = 1;
        this.length = 1;
        this.height = 1;
    }

    // Constructor with arguments
    public DebugBox(int w, int l, int h) {
        this.width = w;
        this.length = l;
        this.height = h;
    }

    public void showData() {
        System.out.println(" Width: " + width + " Length: " + length + " Height: " + height);
    }

    public double getVolume() {
        return width * length * height;
    }
}
