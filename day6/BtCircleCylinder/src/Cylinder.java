public class Cylinder extends Circle {
    private double height = 5.0;

    Cylinder() {

    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * this.getHeight();
    }
    @Override
    public String toString() {
        return "hình trụ có chiều cao:" + getHeight() +" màu :" +getColor() +" thể tích: " + getVolume();
    }
}