public class QuadraticEquation {
    double a, b, c;
    double delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = ((2 * this.b) - (4 * this.a * this.c));
    }
    public String getRoot() {
        if (this.delta > 0) {
            double root1 = ((-this.b + Math.pow(this.delta, 2)) / 2 * a);
            double root2 = ((-this.b - Math.pow(this.delta, 2)) / 2 * a);
            return "nghiệm thứ nhất là " + root1 + " nghiệm thứ 2 là " + root2;
        } else if (this.delta == 0) {
            return "phương trình có một nghiệm là " + ((-this.b + Math.pow(this.delta, 2)) / 2 * a);
        } else {
            return "phương trình vô nghiệm";
        }
    }
}
