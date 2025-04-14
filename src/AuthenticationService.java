import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {

    private Map<String, User> users = new HashMap<>();

    public void registerUser(User user) {
        users.put(user.getEmail(), user);
    }

    public boolean authenticate(String email, String password) {
        User user = users.get(email);
        if (user != null) {
            return this.login(email, password);
        }

        System.out.println("User not found!");
        return false;
    }


    public boolean logout(String email) {
        User user = users.get(email);

        if (user != null) {
            user.setLoggedIn(false);
            System.out.println("Logout Successfully");

            return true;
        }

        System.out.println("User not found!");
        return false;
    }


    boolean login(String email, String password) {
        User user = users.get(email);
        try {
            if (user.getPassword().equals(password)) {
                System.out.println("Login Successfully");
                user.setLoggedIn(true);
                return true;
            } else {
                System.out.println("Login Failed, incorrect password");
                user.setLoggedIn(false);
                return false;
            }
        } catch (NullPointerException e) {
            System.out.println("User not found");
            return false;
        }

    }
}