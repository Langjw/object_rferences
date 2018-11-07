import java.util.Scanner;

public class NameEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String first = scan.nextLine() + " ";

        System.out.println("Please enter your last name: ");
        String last = scan.nextLine();

        String LAST = last.toUpperCase();

        String name = first.concat(LAST);

        System.out.println(name);

    }
}