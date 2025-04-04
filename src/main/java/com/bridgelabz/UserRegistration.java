import java.util.regex.Pattern;

public class UserRegistration {
    String username;
    String email;
    String password;

    public void registerUser(String username, String email, String password){
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        String usernameRegex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";

        boolean matchEmail = Pattern.compile(emailRegex).matcher(email).matches();
        boolean matchUsername = Pattern.compile(usernameRegex).matcher(username).matches();
        boolean matchPassword = Pattern.compile(passwordRegex).matcher(password).matches();

        if (!matchPassword || !matchEmail || !matchUsername) throw new IllegalArgumentException("Illegal Arguments for User");

        this.username = username;
        this.email = email;
        this.password = password;
    }

}
