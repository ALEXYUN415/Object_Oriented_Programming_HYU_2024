package week12;
import java.util.Scanner;

public class CheckPasswordStrength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password to evaluate its strength: ");
        String password = input.nextLine();

        System.out.println("Password Strength: " + evaluatePasswordStrength(password));
    }

    public static String evaluatePasswordStrength(String password) {
        int strengthCount = 0;

        if (password.length() >= 8) {
            strengthCount++;
        }

        if (password.matches(".*[A-Z].*")) {
            strengthCount++;
        }

        if (password.matches(".*[a-z].*")) {
            strengthCount++;
        }

        if (password.matches(".*\\d.*")) {
            strengthCount++;
        }

        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            strengthCount++;
        }

        switch (strengthCount) {
            case 5:
                return "Very Strong";
            case 4:
                return "Strong";
            case 3:
                return "Moderate";
            case 2:
                return "Weak";
            case 1:
                return "Very Weak";
            default:
                return "Very Weak";
        }
    }
}
