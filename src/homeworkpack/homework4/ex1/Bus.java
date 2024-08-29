package homeworkpack.homework4.ex1;

public class Bus extends Vehicle {
    private int maxPassengers;

    public Bus(double width, double height, double length, int maxPassengers) {
        super(width, height, length);
        this.maxPassengers = maxPassengers;
    }
}