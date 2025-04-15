import java.util.regex.Pattern;
import java.util.UUID;
import java.lang.String;

public class User {
    private UUID userID;
    private String name;
    private String email;
    private String phone;
    private int age;
    private boolean gender;
    private boolean isLoggedIn;
    private String password;



    public User(String name, int age, boolean gender, String email, String phone, String password) {

        this.isLoggedIn = false;

        this.userID = UUID.randomUUID();

        setName(name);
        setAge(age);
        setGender(gender);
        setEmail(email);
        setPhone(phone);
        setPassword(password);

    }

    public void setName(String name) {
        if (name.matches(".*\\d|[^a-zA-Z0-9].*")) {
            System.out.println("The name cannot contains numbers or symbols.");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }


    public void setEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if (Pattern.matches(emailRegex, email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email.");
        }
    }

    public String getEmail() {
        return this.email;
    }


    public void setPhone(String phone) {
        // Just accepts egyptian numbers
        String phoneRegex = "^(010|011|012|015)\\d{8}$";
        if (Pattern.matches(phoneRegex, phone)) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone.");
        }
    }

    public String getPhone() {
        return this.phone;
    }


    public void setPassword(String password) {
        String checkSpecialCharsRegex = ".*[^a-zA-Z0-9].*";
        String hasUpperAndLowerRegex = "^(?=.*[a-z])(?=.*[A-Z]).+$";
        String hasNumberRegex = ".*[0-9].*";

        if (password.length() >= 8) {
            if (Pattern.matches(checkSpecialCharsRegex, password)) {
                if (Pattern.matches(hasUpperAndLowerRegex, password)) {
                    if (Pattern.matches(hasNumberRegex, password)) {
                        this.password = password;
                    } else {
                        System.out.println("The password should contain at least one number");
                    }
                } else {
                    System.out.println("The password should contain at least one upper and one lowercase character.");
                }
            } else {
                System.out.println("The password should contain at least one special character.");
            }
        } else {
            System.out.println("The password should be at least 8 characters long.");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public UUID getID() {
        return this.userID;
    }

    public String getPassword() {
        return this.password;
    }


    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean status) {
        this.isLoggedIn = status;
    }


}