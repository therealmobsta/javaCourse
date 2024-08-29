package homeworkpack.homework2.office;

public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public void hurryUpManager(Manager manager) {
        System.out.println(name + ": " + manager.getName() + " быстрее!");
    }

    public String getName() {
        return name;
    }
}
