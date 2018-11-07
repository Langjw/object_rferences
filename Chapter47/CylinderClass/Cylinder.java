public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double Volume() {
        return Math.PI*radius*radius*height;
    }

    public double SurfaceArea() {
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
}