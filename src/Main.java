

public class Main {
    public static void main(String[] args) {

        User user = new User("ahmed", 25, true, "ahmed@yahoo.com", "01054963854", "#Ahmedpass22");

        AuthenticationService authenticationService = new AuthenticationService();
        authenticationService.registerUser(user);
        authenticationService.login("ahmed@yahoo.com", "#Ahmedpass22");

    }
}