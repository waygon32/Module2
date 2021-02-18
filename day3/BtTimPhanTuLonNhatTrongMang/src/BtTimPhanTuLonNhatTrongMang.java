import java.util.Scanner;

public class BtTimPhanTuLonNhatTrongMang {
    public static void main(String[] args) {
        int col;
        int row;
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cột");
        col = scanner.nextInt();
        System.out.print("nhập số dòng");
        row = scanner.nextInt();
        arr = new int[col][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("nhập số  tại vị trí" + (i + 1) + " " + (j + 1) + " : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("dãy số là : ");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        findMax(arr);
    }

    public static void findMax(int[][] array) {
        int max = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        System.out.println("số lớn nhất là");
        System.out.print(max);
    }
}
