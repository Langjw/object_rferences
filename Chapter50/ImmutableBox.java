import java.util.Scanner;

public class ImmutableBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width, height, length;

        boolean nesting = false;

        System.out.println("Enter width: ");
        width = scan.nextDouble();

        System.out.println("Enter height: ");
        height = scan.nextDouble();

        System.out.println("Enter length: ");
        length = scan.nextDouble();

        Box box = new Box(width, height, length);

        System.out.println("Volume: " + box.volume() + " Surface Area: " + box.area());
        System.out.println("Width: " + box.width + " Height: " + box.height + " Length: " + box.length);
        System.out.println("Top Area: " + box.topArea());
        System.out.println("");

        Box oldBox = new Box(width, height, length);

        System.out.println("Volume: " + oldBox.volume() + " Surface Area: " + oldBox.area());
        System.out.println("Width: " + oldBox.width + " Height: " + oldBox.height + " Length: " + oldBox.length);
        System.out.println("Top Area: " + oldBox.topArea());
        System.out.println("");

        Box biggerBox = new Box(1.25*width, 1.25*height, 1.25*length);

        System.out.println("Volume: " + biggerBox.volume() + " Surface Area: " + biggerBox.area());
        System.out.println("Width: " + biggerBox.width + " Height: " + biggerBox.height + " Length: " + biggerBox.length);
        System.out.println("Top Area: " + biggerBox.topArea());
        System.out.println("");

        if (box.volume() > oldBox.volume()) {
            System.out.println("oldBox fits in box");
        }
        if(oldBox.volume() > box.volume()) {
            System.out.println("box fits in oldBox");
        }
        if(biggerBox.volume() > box.volume()) {
            System.out.println("box fits in biggerBox");
        }
        if(box.volume() > biggerBox.volume()) {
            System.out.println("biggerBox fits in box");
        }
        if(oldBox.volume() > biggerBox.volume()) {
            System.out.println("biggerBox fits in oldBox");
        }
        if(biggerBox.volume() > oldBox.volume()) {
            System.out.println("oldBox fits in biggerBox");
        }

    }
}