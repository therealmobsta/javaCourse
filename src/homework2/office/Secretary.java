package homework2.office;

public class Secretary {
    public void calmEveryone(Boss boss, Manager manager, Guard guard) {
        System.out.println("Секретарь: " + boss.getName() + " не волнуйтесь, " + manager.getName() + " все успеет. " + guard.getName() + " - подождите!");
    }
}