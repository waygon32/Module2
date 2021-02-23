public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Radius = " + circle1.getRadius() + ", Area = " + circle1.getArea());

        Circle circle2 = new Circle(15);
        System.out.println("Radius = " + circle2.getRadius()+ ", Area = " + circle2.getArea());
    }
}