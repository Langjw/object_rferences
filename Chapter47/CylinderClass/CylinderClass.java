import java.util.Scanner;

public class CylinderClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius, height;

        System.out.println("Enter radius: ");
        radius = scan.nextDouble();

        System.out.println("Enter Height: ");
        height = scan.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);

        System.out.println("Volume: " + cylinder.Volume() + " Surface Area: " + cylinder.SurfaceArea());
    }
}