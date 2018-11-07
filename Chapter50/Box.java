public class Box {

    double width, height, length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void oldBox(Box oldBox) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void biggerBox(Box biggerBox) {
        this.width = 1.25*width;
        this.height = 1.25*height;
        this.length = 1.25*length;
    }

    public double volume() {
        return width*height*length;
    }

    public double area() {
        return width*width + height*height + length*length;
    }

    public double faceArea() {
        return width*height;
    }

    public double topArea()  {
        return width*width;
    }

    public double sideArea() {
        return length*height;
    }
}