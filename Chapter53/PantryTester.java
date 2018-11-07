import java.util.Scanner;

public class PantryTester {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = "";
        int selection;
        int spread;

        Jam gooseberry = new Jam("Gooseberry", "7/4/86", 24);
        Jam crabapple = new Jam("Crabapple", "9/30/99", 16);
        Jam rhubarb = new Jam("Rhubarb", "10/31/99", 12);

        System.out.println("Welcome to Mother Hubbard's Pantry!");
        System.out.println("");
        System.out.println("The Jams Are: ");

        System.out.println("1. " + gooseberry.type() + "   " + gooseberry.date() + "   " + gooseberry.ounces() + " " + "fl. oz.");
        System.out.println("");
        System.out.println("2. " + crabapple.type() + "   " + crabapple.date() + "   " + crabapple.ounces() + "fl. oz.");
        System.out.println("");
        System.out.println("3. " + rhubarb.type() + "   " + rhubarb.date() + "   " + rhubarb.ounces() + "fl. oz.");

        System.out.println("Enter your selection (1, 2, or 3): ");
        selection = scan.nextInt();
        
        System.out.println("Enter amount to spread: ");
        spread = scan.nextInt();

        if (selection == 1) {
            str = "Gooseberry";
            gooseberry.ounces = gooseberry.ounces - spread;
        }

        if (selection == 2) {
            str = "Crab Apple";
            crabapple.ounces = crabapple.ounces - spread;
        }

        if (selection == 3) {
            str = "Rhubarb";
            rhubarb.ounces = rhubarb.ounces - spread;
        }

        System.out.println("Spreading " + spread + " fluid ounces of " + str);
        System.out.println("");
        System.out.println("");

        System.out.println(gooseberry.type() + "   " + gooseberry.date() + "   " + gooseberry.ounces() + " " + "fl. oz.");
        System.out.println("");
        System.out.println(crabapple.type() + "   " + crabapple.date() + "   " + crabapple.ounces() + "fl. oz.");
        System.out.println("");
        System.out.println(rhubarb.type() + "   " + rhubarb.date() + "   " + rhubarb.ounces() + "fl. oz.");

    }
}