package homework4.ex2;

public class Runner {
    public static void main(String[] args) {
        try {
            Flyable duck1 = new Duck(false);
            duck1.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        try {
            Flyable duck2 = new Duck(true);
            duck2.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        try {
            Flyable airplane1 = new Airplane(10);
            airplane1.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        try {
            Flyable airplane2 = new Airplane(-1);
            airplane2.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }
    }
}