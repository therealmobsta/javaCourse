package homework4.ex1;

public abstract class Vehicle {
    private boolean isDirty;
    private double width;
    private double height;
    private double length;

    public Vehicle(double width, double height, double length) {
        this.isDirty = true;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}