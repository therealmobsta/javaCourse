package homework2.office;

public class Guard {
    private String name;

    public Guard(String name) {
        this.name = name;
    }

    public void askForSalary() {
        System.out.println(name + ": Выдайте мне зарплату.");
    }

    public String getName() {
        return name;
    }
}