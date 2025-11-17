public class DebugCircle implements JCircle {
    private int radius;

    public DebugCircle(int c) {
        this.radius = c;
    }

    @Override
    public int getRad() {
        return radius;
    }

    @Override
    public int getDiam() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getRadAsString() {
        return String.valueOf(radius);
    }

    @Override
    public String getDiamAsString() {
        return String.valueOf(radius * 2);
    }
}
