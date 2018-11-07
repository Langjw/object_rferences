public class Jam {

    int ounces;
    String date;
    String type;

    public Jam(String type, String date, int ounces) {
        this.type = type;
        this.date = date;
        this.ounces = ounces;
    }

    public String type() {
        this.type = type;
        return type;
    }

    public String date() {
        this.date = date;
        return date;
    }
    public int ounces() {
        this.ounces = ounces;
        return ounces;
    }
}