package homework4.ex1;

public class Runner {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();

        Car car1 = new Car(1.8, 2, 5, true);
        Car car2 = new Car(1.8, 2, 5, true);
        Car car3 = new Car(1.8, 2, 5, true);
        Car car4 = new Car(1.8, 2, 5, true);

        Bus bus1 = new Bus(2.3, 3, 12, 50);
        Bus bus2 = new Bus(2.3, 3, 12, 50);
        Bus bus3 = new Bus(2.3, 3, 12, 50);
        Bus bus4 = new Bus(2.3, 3, 12, 50);
        Bus bus5 = new Bus(2.3, 3, 12, 50);

        int totalCost = 0;
        totalCost += carWash.washVehicle(car1);
        totalCost += carWash.washVehicle(car2);
        totalCost += carWash.washVehicle(car3);
        totalCost += carWash.washVehicle(car4);

        totalCost += carWash.washVehicle(bus1);
        totalCost += carWash.washVehicle(bus2);
        totalCost += carWash.washVehicle(bus3);
        totalCost += carWash.washVehicle(bus4);
        totalCost += carWash.washVehicle(bus5);

        System.out.println("Общая стоимость мойки всех машин: " + totalCost);
    }
}