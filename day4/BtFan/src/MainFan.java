import java.util.Scanner;

public class MainFan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tốc độ của quạt");
        String  speed = scanner.nextLine();
        System.out.println("nhập vào trạng thái của quạt");
        String check = scanner.nextLine();
        System.out.println("nhập vào màu quạt");
        String color = scanner.nextLine();
        System.out.println("nhập vào bán kính của quạt");
        double radius = scanner.nextDouble();
        Fan fan = new Fan(speed,check,radius,color);
        System.out.println(fan.display());
    }
}
