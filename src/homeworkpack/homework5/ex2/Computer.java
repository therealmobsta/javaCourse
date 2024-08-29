package homeworkpack.homework5.ex2;

public class Computer {
    private String currentUser;

    public void login(String user) {
        currentUser = user;
    }

    public void logout() {
        currentUser = null;
    }

    public void sendMessage(String message) {
        System.out.println("сообщение: " + message);
    }

    public String getCurrentUser() {
        return currentUser;
    }
}
