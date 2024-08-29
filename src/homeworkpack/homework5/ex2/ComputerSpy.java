package homeworkpack.homework5.ex2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ComputerSpy extends Computer {
    private Computer computer;
    private static final String LOG_FILE = "src/homeworkpack/homework5/ex2/comp.log";

    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void login(String user) {
        log("Пользователь " + user + " вошел");
        computer.login(user);
    }

    @Override
    public void logout() {
        log("Пользователь вышел");
        computer.logout();
    }

    @Override
    public void sendMessage(String message) {
        log("Пользователь " + computer.getCurrentUser() + " отправил сообщение " + message);
        computer.sendMessage(message);
    }

    private void log(String message) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}