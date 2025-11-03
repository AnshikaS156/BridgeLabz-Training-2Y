import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}

class Login {
    private final String validUser = "admin";
    private final String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass))
            throw new InvalidCredentialsException("Invalid username or password!");
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String user = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();

            login.validate(user, pass);
            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
        sc.close();
        
    }
    
    
}
