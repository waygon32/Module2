import java.util.Scanner;

public class BtGopMang {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[] arr1;
        int[] arr2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài dãy số thứ 1");
        size1 = scanner.nextInt();
        System.out.println("nhập độ dài dãy số thứ 2");
        size2 = scanner.nextInt();
        arr1 = new int[size1];
        arr2 = new int[size2];
        System.out.println("trong dãy số thứ nhất : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("nhập số  thứ" + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("trong dãy số thứ 2 : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("nhập số  thứ" + (i + 1) + " : ");
            arr2[i] = scanner.nextInt();
        }
        System.out.print("dãy số thứ 1 là : ");
        for (int k : arr1) {
            System.out.print(k + " ");
        }
        System.out.print("dãy số thứ 2 là : ");
        for (int k : arr2) {
            System.out.print(k + " ");
        }
        merge(arr1, arr2);
    }

    public static void merge(int[] array1, int[] array2) {
        int[] array3;
        array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        System.out.println("mảng gộp lại là");
        for (int k : array3) {
            System.out.print(k + " ");
        }
    }
}

