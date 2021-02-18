import java.util.Scanner;

public class ThTimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter size");
        size = scanner.nextInt();
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("nhập số  thứ" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("dãy số là : ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        minValue(arr);
    }

    public static void minValue(int[] array) {
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.print("có số  nhỏ nhất là " + min + " tại vị trí " + index);
    }
}
