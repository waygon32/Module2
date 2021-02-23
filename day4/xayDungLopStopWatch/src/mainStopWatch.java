import java.util.Random;

public class mainStopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();

        int[] arr = new int[1000];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) {
                    min = j;
                }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int j : arr) {
            System.out.println(j);
        }

        watch.stop();
    }
}