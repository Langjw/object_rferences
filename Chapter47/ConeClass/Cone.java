public class Cone {
     
    private double radius;
    private double height;
    String none = "";

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius));
    }

    public double volume() {
        return Math.PI*radius*radius*height/3.0;
    }

    public double slantHeight() {
        return Math.sqrt(height*height + radius*radius);
    }

    public double angle() {
        return Math.tan(radius/height);
    }
}