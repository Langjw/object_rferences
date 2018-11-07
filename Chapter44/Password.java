import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = "Snowflake47";

        System.out.println("Please enter your password: ");
        String check = scan.nextLine();

        if (password.equals(check)) {
            System.out.println("That password is correct.");
        }
        else {
            System.out.println("That passwrod is incorrect.");
        }

    }
}