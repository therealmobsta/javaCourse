package homework4.ex1;

public class CarWash {
    public int washVehicle(Vehicle vehicle) {
        vehicle.setDirty(false); // Транспортное средство становится чистым
        return getWashCost(vehicle.getLength(), vehicle.getHeight(), vehicle.getWidth());
    }

    private int getWashCost(double length, double height, double width) {
        // Определение стоимости мойки в зависимости от размеров транспортного средства
        if (length > 6 || height > 2.5 || width > 2) {
            return 4000;
        } else {
            return 2000;
        }
    }
}