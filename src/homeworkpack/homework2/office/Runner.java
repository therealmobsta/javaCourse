package homeworkpack.homework2.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Secretary secretary = new Secretary();
        Guard guard = new Guard("Петрович");

        Office office = new Office(boss, manager, secretary, guard);
        office.workDay();
    }
}