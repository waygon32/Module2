import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập hệ số bậc 2");
        double a = scanner.nextDouble();
        System.out.println("nhập hệ số bậc 1");
        double b = scanner.nextDouble();
        System.out.println("nhập hệ số bậc 0");
        double c = scanner.nextDouble();
        System.out.println("phương trình bậc 2" + a + "*x^2 " + b + "*x " + c);
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.getRoot());
    }
}
