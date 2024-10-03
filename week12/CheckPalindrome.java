package week12;
import java.util.Scanner;

public class CheckPalindrome {

    public static boolean validPalindrome(String s) {s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String s = input.nextLine();

        boolean isPalindrome = validPalindrome(s);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
