import java.util.Scanner;

public class BtThemPhanTuVaoMang {
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
        add(arr);
    }

    public static void add(int[] array) {
        int[] newArr;
        int number;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.print("số cần thêm là ");
        number = scanner.nextInt();
        System.out.print("tại vị trí ");
        index = scanner.nextInt();
        if (index <= array.length) {
            newArr = new int[array.length + 1];
            if (index >= 0)
                System.arraycopy(array, 0, newArr, 0, index);
            newArr[index] = number;
            if (array.length + 1 - (index + 1) >= 0)
                System.arraycopy(array, index + 1 - 1, newArr, index + 1, array.length + 1 - (index + 1));
            System.out.print("dãy số mới là : ");
            for (int k : newArr) {
                System.out.print(k + " ");
            }
        } else {
            newArr = new int[index + 1];
            System.arraycopy(array, 0, newArr, 0, array.length);
            for (int j = array.length; j < index; j++) {
                newArr[j] = 0;
            }
            newArr[index] = number;
            System.out.print("dãy số mới là : ");
            for (int k : newArr) {
                System.out.print(k + " ");
            }
        }
    }
}
