package homeworkpack.homework5.ex2;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);

        computerSpy.login("Вова");
        computerSpy.sendMessage("Всем привет!");
        computerSpy.sendMessage("Всем пока");
        computerSpy.logout();


    }
}