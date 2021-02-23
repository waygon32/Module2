public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    String speed;
    double radius = 5;
    String check;
    String color = "blue";

    public Fan(String speed, String check, double radius, String color) {
        this.speed = speed;
        this.check = check;
        this.radius = radius;
        this.color = color;
    }

    public int checkSpeed() {
        switch (this.speed) {
            case "slow":
                return slow;
            case "medium":
                return medium;
            case "fast":
                return fast;
            default:
                return 0;
        }
    }

    public String checkFan() {
        if (this.check.equals("on")) {
            return "bật";
        } else {
            return "tắt";
        }
    }

    public String display() {
        return "quạt có màu " + this.color + " và bán kính " + this.radius + " đang " + this.checkFan() + " với tốc độ " + this.checkSpeed();
    }
}
