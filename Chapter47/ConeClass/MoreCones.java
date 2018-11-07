import java.util.Scanner;

public class MoreCones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius, height;

        System.out.println("Enter radius: ");
        radius = scan.nextDouble();

        System.out.println("Enter Height: ");
        height = scan.nextDouble();

        Cone cone = new Cone(radius, height);

        System.out.println("Area: " + cone.area() + " Volume: " + cone.volume());
        System.out.println("Slant Height: " + cone.slantHeight() + " Angle: " + cone.angle());
    }
}